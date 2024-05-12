package com.yx.xx.transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yx.xx.transaction.domain.Goods;
import com.yx.xx.transaction.dto.PageInfo;

import java.util.List;
import java.util.Map;

public interface GoodsService extends IService<Goods> {
    /**
     * 商品详情
     * @param id
     * @return
     */
    Goods detail(Long id);

    /**
     * 精选
     * @return
     */
    List<Goods> showChosen();

    /**
     * 全部
     * @return
     */
    List<Goods> showAll();

    /**
     * 白菜
     * @return
     */
    List<Goods> showCheaper();

    /**
     * 按分类展示
     * @return
     */
    List<Goods> showByCate(Long categoryId);

    /**
     * 按卖家ID查询
     * @param sellerId
     * @return
     */
    List<Goods> getBySellerId(Long sellerId);

    /**
     * 根据卖家ID遍历商品信息
     * @param draw
     * @param start
     * @param length
     * @param goods
     * @param sellerId
     * @return
     */
    PageInfo<Goods> page1(int draw, int start, int length, Goods goods ,Long sellerId);

    /**
     * 遍历所有商品信息
     * @param draw
     * @param start
     * @param length
     * @param goods
     * @return
     */
    PageInfo<Goods> page(int draw,int start,int length, Goods goods);
    /**
     * 保存商品信息
     * @param goods
     */
    void saveGoods(Goods goods);

    /**
     * 修改精选白菜
     * @param goodsId
     * @param selected
     */
    void updateJb(Long goodsId,int selected);

    /**
     * 删除商品
     * @param id
     */
    void delete(Long id);

    /**
     * 删除选中
     * @param sIds
     */
    void deleteSelected(String[] sIds);

    /**
     * 已交易商品的总额
     * @return
     */
    double getTotalSum();

    /**
     * 商品总数
     * @return
     */
    int getGoodsCount();

    /**
     * 删除选中
     * @param sIds
     */
    void delSelected(String[] sIds);

    /**
     * 卖家首页信息
     * @param id
     * @return
     */
    Map<String,Object> IndexInfoBySellerId(Long id);

    /**
     * 搜索
     * @param search
     * @return
     */
    List<Goods> searchSome(String search);


}
