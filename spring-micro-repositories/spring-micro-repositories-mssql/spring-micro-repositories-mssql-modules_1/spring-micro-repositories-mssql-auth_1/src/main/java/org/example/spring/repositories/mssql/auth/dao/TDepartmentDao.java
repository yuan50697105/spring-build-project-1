package org.example.spring.repositories.mssql.auth.dao;

import org.example.spring.repositories.mssql.auth.table.po.TDepartment;
import org.example.spring.repositories.mssql.auth.table.query.TDepartmentQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TDepartmentDao extends TkBaseDao<TDepartment, TDepartmentQuery> {
    boolean existChildByPIds(List<Long> ids);

    boolean validateDelete(List<Long> ids);
}
