package org.example.spring.repositories.mysql.auth.dao;

import org.example.spring.repositories.mysql.auth.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
