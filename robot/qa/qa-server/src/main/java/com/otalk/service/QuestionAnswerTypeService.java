package com.otalk.service;

import com.otalk.dao.QuestionAnswerTypeDao;
import com.otalk.entity.QuestionAnswerType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangtusheng
 */
@Service
public class QuestionAnswerTypeService {

    @Resource
    private QuestionAnswerTypeDao questionAnswerTypeDao;

    public QuestionAnswerType find(String id) {
        return questionAnswerTypeDao.getOne(id);
    }

    public void save(QuestionAnswerType questionAnswerType){
        questionAnswerTypeDao.save(questionAnswerType);
    }

    public void delete(String id){
        questionAnswerTypeDao.deleteById(id);
    }

}
