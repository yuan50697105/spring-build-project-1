package org.example.spring.repositories.oracle.auth.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.oracle.auth.table.po.TDepartment;
import org.example.spring.repositories.oracle.auth.table.query.TDepartmentQuery;

import java.util.List;

public interface TDepartmentDao extends TkBaseDao<TDepartment, TDepartmentQuery> {
    boolean existChildByPIds(List<Long> ids);

    boolean validateDelete(List<Long> ids);
}
