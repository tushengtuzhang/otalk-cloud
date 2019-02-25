package com.otalk.controller;

import com.otalk.entity.QuestionAnswerType;
import com.otalk.service.QuestionAnswerTypeService;
import com.otalk.vo.ReturnVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author zhangtusheng
 */
@RestController
@RequestMapping(value = "/questionAnswerType")
public class QuestionAnswerTypeController {

    @Resource
    private QuestionAnswerTypeService questionAnswerTypeService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ReturnVO list(HttpSession session) {

//        List<QuestionAnswerType> list=deptAndDataService.mergeDeptAndQAType(companyId,1);
//        ReturnVO<List<QuestionAnswerType>> returnVO = ReturnVO.OK(list);
//        returnVO.setTotal(list.size());
//        return returnVO;
        return null;
    }

    @RequestMapping(value = "/save")
    public ReturnVO save(@RequestBody QuestionAnswerType type) {
        questionAnswerTypeService.save(type);
        return ReturnVO.OK(type);
    }

    @RequestMapping(value = "/deleteTypeAndQA")
    public ReturnVO deleteTypeAndQA(String id) {
        questionAnswerTypeService.delete(id);
        return ReturnVO.OK(null);
    }
}
