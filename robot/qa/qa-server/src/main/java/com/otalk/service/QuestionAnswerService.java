package com.otalk.service;

import com.otalk.dao.IBaseDao;
import com.otalk.dao.QuestionAnswerDao;
import com.otalk.entity.QuestionAnswer;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class QuestionAnswerService extends BaseServiceImpl<QuestionAnswer,Integer> {

    @Resource
    private QuestionAnswerDao questionAnswerDao;

    @Override
    public IBaseDao<QuestionAnswer, Integer> getBaseDao() {
        return questionAnswerDao;
    }
}
