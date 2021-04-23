package org.example.spring.infrastructures.clickhouse.auth.dao;

import org.example.spring.infrastructures.clickhouse.auth.table.po.TResource;

import java.util.List;

public interface UserResourceDao {
    List<TResource> listPermissionByUserId(Long userId);
}
