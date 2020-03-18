package com.qf;

import com.qf.dto.ResultBean;
import com.qf.entity.TProductSearchDTO;

import java.util.List;

public interface ITProductSearchService {
    ResultBean searchByKeyWords(String keyWords);
    ResultBean addProduct(Long id);
}
