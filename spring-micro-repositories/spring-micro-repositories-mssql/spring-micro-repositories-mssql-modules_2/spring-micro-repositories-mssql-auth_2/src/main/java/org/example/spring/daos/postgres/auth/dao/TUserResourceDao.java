package org.example.spring.daos.postgres.auth.dao;

import org.example.spring.daos.postgres.auth.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
