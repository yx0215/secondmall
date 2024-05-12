package com.yx.xx.transaction.vo;

import com.yx.xx.transaction.domain.Category;
import com.yx.xx.transaction.domain.Goods;

import java.io.Serializable;

public class GoodsVO implements Serializable {

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 商品
     */
    private Goods goods;

    /**
     * 分类
     */
    private Category category;
}
