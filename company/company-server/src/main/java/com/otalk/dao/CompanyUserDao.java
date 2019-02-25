package com.otalk.dao;

import com.otalk.entity.CompanyUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author zhangtusheng
 */
public interface CompanyUserDao extends IBaseDao<CompanyUser,Integer>{

    @Query("from CompanyUser cu where cu.identification = :identification")
    CompanyUser getByIdentification(@Param("identification") String identification);
}
