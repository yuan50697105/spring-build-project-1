package org.example.spring.repositories.auth.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.repositories.auth.dao.TUserResourceDao;
import org.example.spring.repositories.auth.mapper.TUserResourceMapper;
import org.example.spring.repositories.auth.table.po.TResource;
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