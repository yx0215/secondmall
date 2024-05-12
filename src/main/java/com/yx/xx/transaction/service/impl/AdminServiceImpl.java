package com.yx.xx.transaction.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yx.xx.transaction.domain.Address;
import com.yx.xx.transaction.domain.Admin;
import com.yx.xx.transaction.mapper.AddressMapper;
import com.yx.xx.transaction.mapper.AdminMapper;
import com.yx.xx.transaction.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        Admin admin = adminMapper.getByUsername(username);

        if(admin != null){
            if (admin.getPassword().equals(password)){
                return admin;
            }
        }
        return null;
    }
}
