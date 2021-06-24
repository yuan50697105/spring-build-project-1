package org.example.spring.repositories.auth.postgres.dao;

import org.example.spring.repositories.auth.postgres.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
