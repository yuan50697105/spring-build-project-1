package org.example.spring.daos.oracle.auth.dao;

import org.example.spring.daos.oracle.auth.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
