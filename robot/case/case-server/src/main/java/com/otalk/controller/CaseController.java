package com.otalk.controller;

import com.otalk.criteria.Criteria;
import com.otalk.criteria.Restrictions;
import com.otalk.entity.AppCase;
import com.otalk.entity.Company;
import com.otalk.feign.CompanyFeign;
import com.otalk.service.AppCaseService;
import com.otalk.vo.ReturnVO;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * @author zhangtusheng
 */
@RestController
@RequestMapping("/appCase")
public class CaseController {

    @Resource
    private AppCaseService appCaseService;

    @Resource
    private CompanyFeign companyFeign;

    @RequestMapping(value = "/list")
    @ResponseBody
    public ReturnVO list(){
        //companyId appId
        Criteria<AppCase> criteria=new Criteria<>();
        criteria.add(Restrictions.eq("company.id",1));
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        appCaseService.findList(criteria,sort);
        return ReturnVO.OK(appCaseService.findList(criteria,sort));
    }



    @RequestMapping(value = "/page")
    @ResponseBody
    public ReturnVO page(@RequestParam(defaultValue = "1") int pageNumber, @RequestParam(defaultValue = "15") int size, @RequestParam(defaultValue = "ASC") Sort.Direction direction, @RequestParam(defaultValue = "id") String orderBy){

        PageRequest pageRequest= PageRequest.of(pageNumber-1,size,new Sort(direction,orderBy));

        return ReturnVO.OK(appCaseService.findAll(pageRequest));

    }

    @RequestMapping(value = "/save")
    @ResponseBody
    @Transactional(rollbackOn = Exception.class)
    public ReturnVO save(AppCase appCase){

        appCase.setCreateTime(new Date());

        appCaseService.save(appCase);
        return ReturnVO.OK(appCase);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    @Transactional(rollbackOn = Exception.class)
    public ReturnVO update(AppCase appCase){

        appCase.setUpdateTime(new Date());
        appCaseService.update(appCase);

        return ReturnVO.OK(appCase);
    }

    @RequestMapping(value="delete")
    @ResponseBody
    @Transactional(rollbackOn = Exception.class)
    public ReturnVO delete(Integer id){
        appCaseService.delete(id);
        return ReturnVO.OK("删除成功");
    }


    @GetMapping("/company/{companyId}")
    @ResponseBody
    public Company get(@PathVariable Integer companyId){
        return companyFeign.get(companyId);
    }


    @RequestMapping(value = "/getListByCompanyId")
    @ResponseBody
    public List<AppCase> getListByCompanyId(Integer companyId){
        Criteria<AppCase> criteria=new Criteria<>();
        criteria.add(Restrictions.eq("company.id",companyId));
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        return appCaseService.findList(criteria,sort);
    }

    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public AppCase find(@PathVariable  Integer id){
        return appCaseService.find(id);
    }
}
