package org.example.spring.repositories.auth.mssql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.auth.mssql.dao.TResourceDao;
import org.example.spring.repositories.auth.mssql.mapper.TResourceMapper;
import org.example.spring.repositories.auth.mssql.mapper.TResourceQueryMapper;
import org.example.spring.repositories.auth.mssql.table.po.TResource;
import org.example.spring.repositories.auth.mssql.table.query.TResourceQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TResourceDaoImpl extends TkBaseDaoImpl<TResource, TResourceQuery, TResourceMapper> implements TResourceDao {
    private final TResourceQueryMapper resourceQueryMapper;

    @Override
    protected Wrapper<TResource> queryWrapper(TResourceQuery tResourceQuery) {
        return null;
    }

    @Override
    public List<TResource> queryListByRoleId(Long roleId) {
        return resourceQueryMapper.queryListByRoleId(roleId);
    }

    @Override
    public List<TResource> queryListByUserId(Long id) {
        return resourceQueryMapper.queryListByUserId(id);
    }
}