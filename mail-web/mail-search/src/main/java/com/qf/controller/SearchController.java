package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.ITProductSearchService;
import com.qf.dto.ResultBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/search")
public class SearchController {
    @Reference
    private ITProductSearchService searchService;

    @RequestMapping("")
    public String searchByKeyword(String keyword, Model model){

        ResultBean resultBean = searchService.searchByKeyWords(keyword);
        //List<TProductSearchDTO>
        model.addAttribute("products",resultBean.getData());
        return "search";
    }

    @ResponseBody
    @RequestMapping("addProduct")
    public ResultBean AddSearch(Long id){
        return searchService.addProduct(id);
    }

}
