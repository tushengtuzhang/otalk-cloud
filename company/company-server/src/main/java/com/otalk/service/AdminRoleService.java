package com.otalk.service;

import com.otalk.dao.AdminRoleDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.AdminRole;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class AdminRoleService extends BaseServiceImpl<AdminRole,Integer> {

    @Resource
    private AdminRoleDao adminRoleDao;

    @Resource
    private AdminUserService adminUserService;

    @Resource
    private DeptService deptService;

    @Override
    public IBaseDao<AdminRole, Integer> getBaseDao() {
        return adminRoleDao;
    }


}
