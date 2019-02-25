package com.otalk.service;

import com.otalk.dao.CompanyConfigDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.CompanyConfig;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class CompanyConfigService extends BaseServiceImpl<CompanyConfig,Integer> {

    @Resource
    private CompanyConfigDao companyConfigDao;

    @Override
    public IBaseDao<CompanyConfig, Integer> getBaseDao() {
        return companyConfigDao;
    }

    public String getByVariable(Integer companyId,String variable){

        return companyConfigDao.queryByVariable(companyId,variable);
    }
}
