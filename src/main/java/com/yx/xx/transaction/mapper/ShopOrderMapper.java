package com.yx.xx.transaction.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.xx.transaction.domain.ShopOrder;

import java.util.List;
import java.util.Map;

public interface ShopOrderMapper extends BaseMapper<ShopOrder> {
    List<ShopOrder> orderPage(Map<String,Object> params);
}