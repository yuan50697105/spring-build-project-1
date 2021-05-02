package org.example.spring.daos.clickhouse.auth.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.clickhouse.auth.dao.UserResourceDao;
import org.example.spring.daos.clickhouse.auth.mapper.UserResourceMapper;
import org.example.spring.daos.clickhouse.auth.table.po.TResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class UserResourceDaoImpl implements UserResourceDao {
    private final UserResourceMapper userResourceMapper;

    @Override
    public List<TResource> listPermissionByUserId(Long userId) {
        return userResourceMapper.listPermissionByUserId(userId);
    }
}