package org.example.spring.repositories.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.auth.table.po.TDepartment;
import org.example.spring.repositories.auth.table.query.TDepartmentQuery;

import java.util.List;

@SuppressWarnings("UnusedReturnValue")
public interface TDepartmentDao extends TkBaseDao<TDepartment, TDepartmentQuery> {
    boolean existChildByPIds(List<Long> ids);

    boolean validateDelete(List<Long> ids);
}
