package org.example.spring.infrastructures.mysql.auth.dao;

import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;

import java.util.List;

public interface UserPermissionDao {
    List<TPermission> listPermissionByUserId(Long userId);
}
