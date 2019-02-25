package com.otalk.service;

import com.otalk.dao.AppCaseDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.AppCase;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class AppCaseService extends BaseServiceImpl<AppCase, Integer> {

    @Resource
    private AppCaseDao appCaseDao;

    @Override
    public IBaseDao<AppCase, Integer> getBaseDao() {
        return appCaseDao;
    }

}
