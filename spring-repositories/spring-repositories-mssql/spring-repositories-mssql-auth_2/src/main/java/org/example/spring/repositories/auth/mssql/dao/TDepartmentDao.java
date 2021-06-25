package org.example.spring.repositories.auth.mssql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.auth.mssql.table.po.TDepartment;
import org.example.spring.repositories.auth.mssql.table.query.TDepartmentQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TDepartmentDao extends TkBaseDao<TDepartment, TDepartmentQuery> {
    boolean existChildByPIds(List<Long> ids);

    boolean validateDelete(List<Long> ids);
}
