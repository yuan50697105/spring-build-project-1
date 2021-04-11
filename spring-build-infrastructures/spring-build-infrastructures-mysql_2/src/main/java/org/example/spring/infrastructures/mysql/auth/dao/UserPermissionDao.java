package org.example.spring.infrastructures.mysql.auth.dao;

import org.example.spring.infrastructures.mysql.auth.table.po.TResource;

import java.util.List;

public interface UserPermissionDao {
    List<TResource> listPermissionByUserId(Long userId);
}
