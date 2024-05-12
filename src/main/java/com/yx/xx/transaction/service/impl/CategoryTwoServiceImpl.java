package com.yx.xx.transaction.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yx.xx.transaction.domain.Address;
import com.yx.xx.transaction.domain.CategoryTwo;
import com.yx.xx.transaction.mapper.AddressMapper;
import com.yx.xx.transaction.mapper.CategoryTwoMapper;
import com.yx.xx.transaction.service.CategoryTwoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryTwoServiceImpl extends ServiceImpl<CategoryTwoMapper, CategoryTwo> implements CategoryTwoService {
    @Resource
    private CategoryTwoMapper categoryTwoMapper;

    @Override
    public List<CategoryTwo> getAll() {
        return categoryTwoMapper.selectList(Wrappers.lambdaQuery());
    }
}
