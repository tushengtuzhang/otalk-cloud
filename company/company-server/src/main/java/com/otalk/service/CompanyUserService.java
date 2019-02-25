package com.otalk.service;

import com.otalk.dao.CompanyUserDao;
import com.otalk.dao.CompanyUserRedisDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.CompanyUser;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class CompanyUserService extends BaseServiceImpl<CompanyUser,Integer> {

    @Resource
    private CompanyUserDao companyUserDao;

    @Resource
    private CompanyUserRedisDao companyUserRedisDao;

    @Override
    public IBaseDao<CompanyUser, Integer> getBaseDao() {
        return companyUserDao;
    }

    public String getUserNameByIdentification(String identification) {
        String userName = "匿名用户";
        CompanyUser companyUser = this.getByIdentification(identification);
        if (companyUser != null) {
            if (companyUser.getUsername() != null) {
                userName = companyUser.getUsername();
            }
        }

        return userName;
    }

    public CompanyUser getByIdentification(String identification) {
        CompanyUser user = companyUserDao.getByIdentification(identification);
        if (user == null) {
            user = companyUserRedisDao.getByIdentification(identification);
        }
        return user;
    }
}
