package com.qf.mapper;

import com.qf.entity.TProductSearchDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TProductSearchDTOMapper {
    List<TProductSearchDTO> findAll();
    TProductSearchDTO selectById(Long id);
}
