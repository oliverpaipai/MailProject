package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.ITProductSearchService;
import com.qf.dto.ResultBean;
import com.qf.entity.TProductSearchDTO;
import com.qf.mapper.TProductSearchDTOMapper;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@Service
public class TProductSearchServiceImpl implements ITProductSearchService {
    @Autowired
    private SolrClient solrClient;
    @Resource
    private TProductSearchDTOMapper mapper;
    @Value("${imageServer}")
    private String imageServer;

    @Override
    public ResultBean searchByKeyWords(String keyWords) {
        //创建查询对象
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.set("df","t_product_name");
        solrQuery.setQuery(keyWords);
        //分页
        solrQuery.setStart(0);
        solrQuery.setRows(12);
        //高亮
        solrQuery.setHighlight(true);
        solrQuery.addHighlightField("t_product_name");
        solrQuery.setHighlightSimplePre("<span style='color:red'>");
        solrQuery.setHighlightSimplePost("</span>");
        try {
            QueryResponse response = solrClient.query(solrQuery);
            List<TProductSearchDTO> searchDTOList = new ArrayList<>();
            //获得数据集结果
            SolrDocumentList results = response.getResults();
            System.out.println(results.getNumFound());
            //获得高亮结果集
            Map<String, Map<String, List<String>>> lightingResults = response.getHighlighting();
            for (SolrDocument result : results) {
                TProductSearchDTO product = new TProductSearchDTO();
                String stringId = (String) result.getFieldValue("id");
                long id = Long.parseLong(stringId);
                product.setId(id);
                //从高亮结果集中拿到带高亮效果的t_product_name
                Map<String, List<String>> stringListMap = lightingResults.get(stringId);
                List<String> t_product_name1 = stringListMap.get("t_product_name");
                String t_product_name = t_product_name1.get(0);
                product.settProductName(t_product_name);

                double t_product_price = (double) result.getFieldValue("t_product_price");
                product.settProductPrice(t_product_price);
                double t_product_saleprice = (double) result.getFieldValue("t_product_saleprice");
                product.settProductSaleprice(t_product_saleprice);
                String t_product_pimage = (String) result.getFieldValue("t_product_pimage");
                product.settProductPimage(imageServer+"/"+t_product_pimage);
                String t_product_pdesc = (String) result.getFieldValue("t_product_pdesc");
                product.settProductPdesc(t_product_pdesc);
                System.out.println("========---------"+product);
                searchDTOList.add(product);
            }
            return ResultBean.success(searchDTOList);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultBean.error("查询出现异常");
    }

    /**
     *  //1.根据pid从数据库中获取该商品
     *         //2.封装成SolrInputDocument
     *         //3.插入到solr库里
     * @param id
     * @return
     */
    @Override
    public ResultBean addProduct(Long id) {
        TProductSearchDTO product = mapper.selectById(id);
        System.out.println(product);
        System.out.println(mapper);
        //封装成SolrInputDocument
        SolrInputDocument solrDocument = new SolrInputDocument();
        solrDocument.setField("id",product.getId());
        solrDocument.setField("t_product_name",product.gettProductName());
        solrDocument.setField("t_product_price",product.gettProductPrice());
        solrDocument.setField("t_product_saleprice",product.gettProductSaleprice());
        solrDocument.setField("t_product_pimage",product.gettProductPimage());
        solrDocument.setField("t_product_pdesc",product.gettProductPdesc());
        //插入到solr库中
        try {
            System.out.println("------------solr"+solrDocument);
            solrClient.add(solrDocument);
            solrClient.commit();

            return ResultBean.success(solrDocument,"插入到solr库成功");
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultBean.success("插入到solr库失败");
    }
}
