package org.example.spring.daos.postgresql.auth.dao;

import org.example.spring.daos.postgresql.auth.table.po.TResource;

import java.util.List;

public interface UserResourceDao {
    List<TResource> listPermissionByUserId(Long userId);
}
