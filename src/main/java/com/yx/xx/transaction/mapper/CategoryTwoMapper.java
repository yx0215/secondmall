package com.yx.xx.transaction.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.xx.transaction.domain.CategoryTwo;

import java.util.List;

public interface CategoryTwoMapper extends BaseMapper<CategoryTwo> {
    List<CategoryTwo> getByCategoryId(Long categoryId);
}