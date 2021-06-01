package org.example.spring.repositories.postgres.auth.dao;

import org.example.spring.repositories.postgres.auth.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
