package com.otalk.controller;

import com.hankcs.hanlp.seg.common.Term;
import com.otalk.service.FileOperator;
import com.otalk.service.OTNlp;
import com.otalk.service.OTTokenizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangtusheng
 */
@RestController
@RequestMapping(value = "/nlp")
public class NlpController {

    @RequestMapping(value="/updateDictionary")
    public void update(Integer companyId,String text){
        FileOperator.reWriteFile(OTNlp.getCompanyDic(companyId), text);
        OTTokenizer.refreshDic(companyId);
    }

    @RequestMapping(value = "/segment")
    public List<Term> segment(Integer companyId,String text){
        List<Term> segment = OTNlp.segment(companyId, text);
        return segment;
    }
}
