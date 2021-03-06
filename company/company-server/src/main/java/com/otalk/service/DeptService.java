package com.otalk.service;

import com.otalk.criteria.Criteria;
import com.otalk.criteria.Restrictions;
import com.otalk.dao.DeptDao;
import com.otalk.entity.AdminUser;
import com.otalk.entity.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangtusheng
 */
@Service
public class DeptService {

    @Resource
    private DeptDao deptDao;

    @Resource
    private AdminUserService adminUserService;

    public Dept find(String id) {
        return deptDao.getOne(id);
    }

    public void save(Dept dept){
        deptDao.save(dept);
    }

    public List<Dept> selectListByCompanyId(Integer companyId){
        Criteria<Dept> criteria=new Criteria<>();
        criteria.add(Restrictions.eq("company.id",companyId));

        return deptDao.findAll(criteria);
    }

    public List<String> selectDeptIdListByUserId(Integer userId){
        AdminUser adminUser=adminUserService.find(userId);
        if(adminUser.getUserType()==null){
            Criteria<Dept> criteria=new Criteria<>();
            criteria.add(Restrictions.eq("company.id",adminUser.getCompany().getId()));

            List<Dept> deptList = deptDao.findAll(criteria);
            List<String> deptIdList=new ArrayList<>();
            deptList.forEach(dept -> deptIdList.add(dept.getId()));

            return deptIdList;

        }else{
            //return deptDao.selectDeptIdListByUserId(userId);
        }
        return null;
    }

}
