package org.example.spring.repositories.mssql.auth.dao;

import org.example.spring.repositories.mssql.auth.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
