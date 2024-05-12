package com.yx.xx.transaction.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.xx.transaction.domain.Admin;

public interface AdminMapper extends BaseMapper<Admin> {
    Admin getByUsername(String username);
}