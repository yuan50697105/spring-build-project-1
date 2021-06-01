package org.example.spring.repositories.clickhouse.auth.dao;

import org.example.spring.repositories.clickhouse.auth.table.po.TResource;

import java.util.List;

public interface UserResourceDao {
    List<TResource> listPermissionByUserId(Long userId);
}
