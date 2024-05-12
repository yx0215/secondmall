package com.yx.xx.transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yx.xx.transaction.domain.Banner;

import java.util.List;

public interface BannerService extends IService<Banner> {

    /**
     * 广告列表
     * @return
     */
    List<Banner> showBanner();
}
