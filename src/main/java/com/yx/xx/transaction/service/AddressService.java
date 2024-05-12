package com.yx.xx.transaction.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yx.xx.transaction.domain.Address;

public interface AddressService extends IService<Address> {

    /**
     * 地址详情
     * @param userId
     * @return
     */
    Address getByUserId(Long userId);

}
