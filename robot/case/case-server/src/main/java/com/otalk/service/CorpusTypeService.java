package com.otalk.service;

import com.otalk.dao.CorpusTypeDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.CompCorpusType;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class CorpusTypeService extends BaseServiceImpl<CompCorpusType,Integer> {

    @Resource
    private CorpusTypeDao corpusTypeDao;

    @Override
    public IBaseDao<CompCorpusType, Integer> getBaseDao() {
        return corpusTypeDao;
    }
}
