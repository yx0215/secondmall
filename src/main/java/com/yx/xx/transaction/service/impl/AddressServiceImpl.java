package com.yx.xx.transaction.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yx.xx.transaction.domain.Address;
import com.yx.xx.transaction.mapper.AddressMapper;
import com.yx.xx.transaction.service.AddressService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper,Address> implements AddressService {

    @Resource
    private AddressMapper addressMapper;

    /**
     * 通过用户ID查找地址
     * @param userId
     * @return
     */
    @Override
    public Address getByUserId(Long userId) {
        //Example example = new Example(Address.class);
        //example.createCriteria().andEqualTo("userId", userId);
        return addressMapper.selectOne(Wrappers.<Address>lambdaQuery().eq(Address::getUserId,userId));
    }
}
