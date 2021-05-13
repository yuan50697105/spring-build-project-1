package org.example.spring.daos.mysql.department.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.department.dao.TCheckDepartmentDao;
import org.example.spring.daos.mysql.department.mapper.TCheckDepartmentMapper;
import org.example.spring.daos.mysql.department.table.po.TCheckDepartment;
import org.example.spring.daos.mysql.department.table.query.TCheckDepartmentQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TCheckDepartmentDaoImpl extends TkBaseDaoImpl<TCheckDepartment, TCheckDepartmentQuery, TCheckDepartmentMapper> implements TCheckDepartmentDao {
    @Override
    protected Wrapper<TCheckDepartment> queryWrapper(TCheckDepartmentQuery tCheckDepartmentQuery) {
        return null;
    }
}