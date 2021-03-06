package org.example.spring.repositories.auth.oracle.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.auth.oracle.dao.TDepartmentDao;
import org.example.spring.repositories.auth.oracle.mapper.TDepartmentMapper;
import org.example.spring.repositories.auth.oracle.table.po.TDepartment;
import org.example.spring.repositories.auth.oracle.table.query.TDepartmentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TDepartmentDaoImpl extends TkBaseDaoImpl<TDepartment, TDepartmentQuery, TDepartmentMapper> implements TDepartmentDao {
    @Override
    protected Wrapper<TDepartment> queryWrapper(TDepartmentQuery tDepartmentQuery) {
        return null;
    }

    @Override
    public boolean existChildByPIds(List<Long> ids) {
        return baseMapper.existChildByPIds(ids);
    }

    @Override
    public boolean validateDelete(List<Long> ids) {
        return SqlHelper.retBool(baseMapper.validateDelete(ids));
    }
}