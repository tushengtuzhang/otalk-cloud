package com.otalk.service;

import com.otalk.dao.FlowQuestionDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.FlowQuestion;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class FlowQuestionService extends BaseServiceImpl<FlowQuestion,Integer> {

    @Resource
    private FlowQuestionDao flowQuestionDao;

    @Override
    public IBaseDao<FlowQuestion, Integer> getBaseDao() {
        return flowQuestionDao;
    }
}
