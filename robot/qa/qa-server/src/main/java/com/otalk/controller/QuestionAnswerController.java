package com.otalk.controller;

import com.otalk.criteria.Criteria;
import com.otalk.criteria.Restrictions;
import com.otalk.entity.QuestionAnswer;
import com.otalk.service.QuestionAnswerService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangtusheng
 */
@RestController
@RequestMapping(value = "/questionAnswer")
public class QuestionAnswerController {

    @Resource
    private QuestionAnswerService questionAnswerService;

    @RequestMapping(value = "/getListByCompanyId")
    @ResponseBody
    public List<QuestionAnswer> getListByCompanyId(Integer companyId){
        Criteria<QuestionAnswer> criteria=new Criteria<>();
        criteria.add(Restrictions.eq("company.id",companyId));
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        return questionAnswerService.findList(criteria,sort);
    }

    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public QuestionAnswer get(@PathVariable Integer id){
        return questionAnswerService.find(id);
    }
}
