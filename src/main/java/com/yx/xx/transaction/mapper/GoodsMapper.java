package com.yx.xx.transaction.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.xx.transaction.domain.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsMapper extends BaseMapper<Goods> {
    /**
     * 精选
     * @return
     */
    List<Goods> getChosen();

    /**
     * 白菜
     * @return
     */
    List<Goods> getCheaper();

    /**
     * 按分类查找
     * @return
     */
    List<Goods> getByCate(Long categoryId);

    /**
     * 分页
     * @param params
     * @return
     */
    List<Goods> goodsPage(Map<String,Object> params);

    List<Goods> goodsPageBySellerId(Map<String,Object> params);

    /**
     * 商品已交易总额
     * @return
     */
    double getTotalSum();

    /**
     * 商品总数
     * @return
     */
    int getGoodsCount();

    /**
     * 一个卖家的商品数量
     * @param sellerId
     * @return
     */
    int GoodsCountBySellerId(Long sellerId);
    /**
     * 根据商品ID查询商品信息
     * @param goodsId 商品ID
     * @return 查询到的商品信息，如果不存在则返回null
     */
    Goods findById(@Param("goodsId") Long goodsId);

    int update(Goods goods);
}