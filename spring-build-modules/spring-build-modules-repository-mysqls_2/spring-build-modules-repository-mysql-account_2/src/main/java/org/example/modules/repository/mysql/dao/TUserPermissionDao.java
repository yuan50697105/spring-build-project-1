package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.table.po.TPermission;

import java.util.List;

public interface TUserPermissionDao {
    List<TPermission> getPermissionsByUserId(Long id);
}
