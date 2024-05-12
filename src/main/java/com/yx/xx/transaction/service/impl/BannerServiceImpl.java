package com.yx.xx.transaction.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yx.xx.transaction.domain.Address;
import com.yx.xx.transaction.domain.Banner;
import com.yx.xx.transaction.mapper.AddressMapper;
import com.yx.xx.transaction.mapper.BannerMapper;
import com.yx.xx.transaction.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements BannerService {

    @Resource
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> showBanner() {
        List<Banner> banners = bannerMapper.selectList(Wrappers.lambdaQuery());
        return banners;
    }
}
