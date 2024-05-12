package com.yx.xx.transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yx.xx.transaction.domain.CategoryTwo;

import java.util.List;

public interface CategoryTwoService extends IService<CategoryTwo> {
    /**
     * 查询所有子分类
     *
     * @return
     */
    List<CategoryTwo> getAll();
}
