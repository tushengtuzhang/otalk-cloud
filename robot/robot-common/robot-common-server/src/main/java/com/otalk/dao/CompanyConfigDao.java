package com.otalk.dao;

import com.otalk.entity.CompanyConfig;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author zhangtusheng
 */
public interface CompanyConfigDao extends IBaseDao<CompanyConfig,Integer>{

    @Query("select value from CompanyConfig  where company.id=:companyId and variable=:variable")
    String queryByVariable(@Param("companyId") Integer companyId, @Param("variable") String variable);
}
