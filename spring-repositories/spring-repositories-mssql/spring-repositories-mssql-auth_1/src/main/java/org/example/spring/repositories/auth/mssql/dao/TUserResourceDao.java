package org.example.spring.repositories.auth.mssql.dao;

import org.example.spring.repositories.auth.mssql.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
