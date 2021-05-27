package org.example.spring.daos.clickhouse.auth.dao;

import org.example.spring.daos.clickhouse.auth.table.po.TResource;

import java.util.List;

public interface UserResourceDao {
    List<TResource> listPermissionByUserId(Long userId);
}
