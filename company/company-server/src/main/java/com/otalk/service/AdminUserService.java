package com.otalk.service;

import com.otalk.dao.AdminUserDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.AdminUser;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class AdminUserService extends BaseServiceImpl<AdminUser,Integer> {

    @Resource
    private AdminUserDao adminUserDao;

    @Override
    public IBaseDao<AdminUser, Integer> getBaseDao() {
        return adminUserDao;
    }
}
