package com.otalk.service;

import com.otalk.dao.CaseQuestionDao;
import com.otalk.dao.IBaseDao;
import com.otalk.entity.AppCaseQuestion;
import com.otalk.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class CaseQuestionService extends BaseServiceImpl<AppCaseQuestion,Integer> {

    @Resource
    private CaseQuestionDao caseQuestionDao;

    @Override
    public IBaseDao<AppCaseQuestion, Integer> getBaseDao() {
        return caseQuestionDao;
    }
}
