package org.example.spring.repositories.auth.mysql.dao;

import org.example.spring.repositories.auth.mysql.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
