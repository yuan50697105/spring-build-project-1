package org.example.modules.repository.mysql.dao.impl;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TUserPermissionDao;
import org.example.modules.repository.mysql.table.po.TPermission;
import org.example.modules.repository.mysql.mapper.TUserPermissionMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@AllArgsConstructor
@Transactional
public class TUserPermissionDaoImpl implements TUserPermissionDao {
    private final TUserPermissionMapper userPermissionMapper;

    @Override
    public List<TPermission> getPermissionsByUserId(Long id) {
        return userPermissionMapper.getPermissionsByUserId(id);
    }
}