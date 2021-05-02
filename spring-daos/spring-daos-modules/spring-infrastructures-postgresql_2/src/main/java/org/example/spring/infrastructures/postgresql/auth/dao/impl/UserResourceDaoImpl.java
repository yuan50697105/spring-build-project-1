package org.example.spring.infrastructures.postgresql.auth.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.postgresql.auth.dao.UserResourceDao;
import org.example.spring.infrastructures.postgresql.auth.mapper.UserResourceMapper;
import org.example.spring.infrastructures.postgresql.auth.table.po.TResource;
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