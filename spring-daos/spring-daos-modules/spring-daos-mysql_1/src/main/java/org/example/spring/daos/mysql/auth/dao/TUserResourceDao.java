package org.example.spring.daos.mysql.auth.dao;

import org.example.spring.daos.mysql.auth.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
