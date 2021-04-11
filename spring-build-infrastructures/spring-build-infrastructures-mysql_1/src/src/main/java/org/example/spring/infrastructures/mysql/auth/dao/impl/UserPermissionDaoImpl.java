package org.example.spring.infrastructures.mysql.auth.dao.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.dao.UserPermissionDao;
import org.example.spring.infrastructures.mysql.auth.mapper.UserPermissionMapper;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
@Transactional
public class UserPermissionDaoImpl implements UserPermissionDao {
    private final UserPermissionMapper userPermissionMapper;

    @Override
    public List<TPermission> listPermissionByUserId(Long userId) {
        return userPermissionMapper.listPermissionByUserId(userId);
    }
}