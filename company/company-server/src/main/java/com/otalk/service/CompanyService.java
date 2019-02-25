package com.otalk.service;

import com.otalk.dao.CompanyDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.Company;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class CompanyService extends BaseServiceImpl<Company, Integer> {

    @Resource
    private CompanyDao companyDao;

    @Override
    public IBaseDao<Company, Integer> getBaseDao() {
        return companyDao;
    }

    @Cacheable(value = "company",key="#id")
    @Override
    public Company find(Integer id) {
        System.out.println("load2");
        return super.find(id);
    }
}
