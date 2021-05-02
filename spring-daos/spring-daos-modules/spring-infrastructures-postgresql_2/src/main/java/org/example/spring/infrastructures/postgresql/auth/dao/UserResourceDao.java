package org.example.spring.infrastructures.postgresql.auth.dao;

import org.example.spring.infrastructures.postgresql.auth.table.po.TResource;

import java.util.List;

public interface UserResourceDao {
    List<TResource> listPermissionByUserId(Long userId);
}
