package com.otalk.feign;

import com.otalk.entity.Flow;
import com.otalk.entity.FlowQuestion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author zhangtusheng
 */
@FeignClient(value="flow-server")
public interface FlowFeign {

    /**
     * 根据公司Id获取列表
     * @param companyId 公司Id
     * @return list
     */
    @RequestMapping("/flow/getListByCompanyId")
    List<Flow> getListByCompanyId(@RequestParam(value = "companyId") Integer companyId);

    @RequestMapping("/flow/get/{id}")
    Flow get(@PathVariable(value = "id") Integer id);

    @RequestMapping("/flowQuestion/get/{id}")
    FlowQuestion getFlowQuestionById(@PathVariable(value = "id") Integer id);
}
