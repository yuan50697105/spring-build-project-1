package org.example.spring.repositories.auth.oracle.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.auth.oracle.dao.TResourceDao;
import org.example.spring.repositories.auth.oracle.mapper.TResourceMapper;
import org.example.spring.repositories.auth.oracle.mapper.TResourceQueryMapper;
import org.example.spring.repositories.auth.oracle.table.po.TResource;
import org.example.spring.repositories.auth.oracle.table.query.TResourceQuery;
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