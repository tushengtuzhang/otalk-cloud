package com.otalk.controller;

import com.otalk.criteria.Criteria;
import com.otalk.criteria.Restrictions;
import com.otalk.entity.AppCaseQuestion;
import com.otalk.service.CaseQuestionService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangtusheng
 */
@RestController
@RequestMapping("/appCaseQuestion")
public class CaseQuestionController {

    @Resource
    private CaseQuestionService caseQuestionService;

    @RequestMapping("/get")
    @ResponseBody
    AppCaseQuestion get(Integer id){
        return caseQuestionService.find(id);
    }

    @RequestMapping("/getListByCaseId")
    @ResponseBody
    List<AppCaseQuestion> getListByCaseId(Integer caseId){
        Criteria<AppCaseQuestion> criteria=new Criteria<>();
        criteria.add(Restrictions.eq("case.id",caseId));
        Sort sort=new Sort(Sort.Direction.DESC,"id");

        return caseQuestionService.findList(criteria,sort);
    }
}
