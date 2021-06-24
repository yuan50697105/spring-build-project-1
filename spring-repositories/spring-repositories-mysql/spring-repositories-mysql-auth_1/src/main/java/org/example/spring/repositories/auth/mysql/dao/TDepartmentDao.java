package org.example.spring.repositories.auth.mysql.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.auth.mysql.table.po.TDepartment;
import org.example.spring.repositories.auth.mysql.table.query.TDepartmentQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TDepartmentDao extends TkBaseDao<TDepartment, TDepartmentQuery> {
    boolean existChildByPIds(List<Long> ids);

    boolean validateDelete(List<Long> ids);
}
