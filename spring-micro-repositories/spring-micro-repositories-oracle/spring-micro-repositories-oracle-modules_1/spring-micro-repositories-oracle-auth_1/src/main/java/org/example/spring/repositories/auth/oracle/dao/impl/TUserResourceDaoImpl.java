package org.example.spring.repositories.auth.oracle.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.repositories.auth.oracle.dao.TUserResourceDao;
import org.example.spring.repositories.auth.oracle.mapper.TUserResourceMapper;
import org.example.spring.repositories.auth.oracle.table.po.TResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class TUserResourceDaoImpl implements TUserResourceDao {
    private final TUserResourceMapper userResourceMapper;

    @Override
    public List<TResource> listResourceByUserId(Long userId) {
        return userResourceMapper.listPermissionByUserId(userId);
    }
}