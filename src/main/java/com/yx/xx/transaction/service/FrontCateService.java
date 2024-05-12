package com.yx.xx.transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yx.xx.transaction.domain.Goods;
import com.yx.xx.transaction.dto.PageResult;

public interface FrontCateService {
    /**
     * 分页
     * @param pageNum
     * @param categoryId
     * @return
     */
    PageResult<Goods> goodsPage(int pageNum, Long categoryId);
}
