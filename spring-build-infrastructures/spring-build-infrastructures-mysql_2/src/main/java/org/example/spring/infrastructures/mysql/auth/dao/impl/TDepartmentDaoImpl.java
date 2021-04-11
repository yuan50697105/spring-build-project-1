package org.example.spring.infrastructures.mysql.auth.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.dao.TDepartmentDao;
import org.example.spring.infrastructures.mysql.auth.mapper.TResourceMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TDepartment;
import org.example.spring.infrastructures.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TDepartmentDaoImpl extends TkBaseDaoImpl<TDepartment, TDepartmentQuery, TResourceMapper> implements TDepartmentDao {
    @Override
    protected Wrapper<TDepartment> queryWrapper(TDepartmentQuery tDepartmentQuery) {
        return null;
    }
}