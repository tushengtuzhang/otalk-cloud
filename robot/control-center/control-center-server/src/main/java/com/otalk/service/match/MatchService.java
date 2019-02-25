package com.otalk.service.match;

import com.otalk.vo.Message;
import com.otalk.vo.TextMessage;
import org.springframework.stereotype.Service;

/**
 * @author zhangtusheng
 */
@Service
public class MatchService {

    /*@Resource
    private MatchProcessService matchProcessService;

    public Message response(Integer companyId,String request,String identification,boolean isAnonymous){

        //第一步   查询场景（含快问快答，流程树）
        Message message = matchProcessService.response(companyId, request, identification,isAnonymous);
        if(message!=null){
            return message;
        }

        //第二步   查询场景、流程树、问答的可选列表0.5-0.8的
        message=knowledgeMatchService.response(companyId,request);
        if(message!=null){
            return message;
        }
        //第三步   查询文档索引
        message=this.responseSearchDocument(companyId,request,identification,isAnonymous);
        if(message!=null){
            return message;
        }

        //都查不到结果，则返回导航tab
        String tips = sysBaseConfigService.getGreetings(NOT_MATCH, companyId);

        return new UnMatchMessage(tips,serviceMatchService.getThirdPartServices(companyId));

        return new TextMessage("找不到");

    }*/
}
