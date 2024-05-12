package com.yx.xx.transaction.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yx.xx.transaction.domain.Cart;
import com.yx.xx.transaction.domain.Goods;
import com.yx.xx.transaction.mapper.CartMapper;
import com.yx.xx.transaction.mapper.GoodsMapper;
import com.yx.xx.transaction.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {

    @Resource
    private CartMapper cartMapper;

    @Resource
    private GoodsMapper goodsMapper;

    /**
     * 购物车添加商品
     * @param userId
     * @param sellerId
     * @param goodsId
     * @return
     */
    @Override
    public List<Cart> add(Long userId, Long sellerId, Long goodsId) {
        // 查询出原来该用户的购物车
        List<Cart> cartGoods = cartMapper.getByUserId(userId);

        // 遍历原来的购物车，如果本次有本次添加的商品则叠加，没有则新增一条记录
        for (int i = 0; i < cartGoods.size(); i++) {
            Cart cartGood = cartGoods.get(i);
            // 判断原来的购物车是否有这次需要添加的商品
            if (cartGood.getGoodsId().equals(goodsId)) {
                // 如果有则叠加商品
                // 原来的商品数量
                Integer oldBuyCount = cartGood.getBuyCount();
                cartGood.setBuyCount(++oldBuyCount);
                // 设置回原来的购物车
                cartGoods.set(i, cartGood);
                // 更新数据库
                cartMapper.updateById(cartGood);
                //cartMapper.updateByPrimaryKeySelective(cartGood);
                return cartGoods;
            }
        }
        // 原来的购物车没有商品记录,新增一条记录
        // 根据商品 ID 查询商品
        Goods goods = goodsMapper.selectById(goodsId);
        if (goods != null) {
            Cart newCartItem = new Cart();
            newCartItem.setSellerId(sellerId);
            newCartItem.setUserId(userId);
            newCartItem.setGoodsId(goodsId);
            newCartItem.setBuyCount(1);
            newCartItem.setGoodsPrice(goods.getPrice());
            newCartItem.setGoodsName(goods.getGoodsName());
            newCartItem.setGoodsImg(goods.getPicture1());
            cartGoods.add(newCartItem);
            // 添加到数据库
            cartMapper.insert(newCartItem);
        }

        return cartGoods;
    }
    /**
     * 减少商品库存数量
     * @param goodsId 商品ID
     * @param count 要减少的数量
     */
    public void decreaseStock(Long goodsId, int count) {
        // 获取商品信息
        Goods goods = goodsMapper.findById(goodsId);
        if (goods != null) {
            // 获取当前库存数量
            int currentStock = goods.getGoodsNumber();
            // 计算减少后的库存数量
            int updatedStock = currentStock - count;
            // 如果库存数量不小于0，则更新库存信息
            if (updatedStock >= 0) {
                goods.setGoodsNumber(updatedStock);
                // 更新库存信息
                goodsMapper.update(goods);
            } else {
                // 库存不足，抛出异常或者进行其他处理
                throw new RuntimeException("库存不足");
            }
        }
    }
    @Override
    public List<Cart> delete(Long userId, Long goodsId) {
        cartMapper.deleteByUserIdAndGoodsId(userId, goodsId);

        // 查询出原来该用户的购物车
        List<Cart> cartGoods = cartMapper.getByUserId(userId);

        return cartGoods;
    }


    @Override
    public List<Cart> getByUserId(Long userId) {
        return cartMapper.getByUserId(userId);
    }

    @Override
    public void deleteByUserId(Long userId) {
//        Example example = new Example(Cart.class);
//        example.createCriteria().andEqualTo("userId",userId);
//        cartMapper.deleteByExample(example);
        cartMapper.delete(Wrappers.<Cart>lambdaQuery().eq(Cart::getUserId,userId));
    }

}
