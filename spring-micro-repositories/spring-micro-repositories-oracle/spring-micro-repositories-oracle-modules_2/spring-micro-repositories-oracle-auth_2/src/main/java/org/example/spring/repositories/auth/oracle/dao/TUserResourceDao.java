package org.example.spring.repositories.auth.oracle.dao;

import org.example.spring.repositories.auth.oracle.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
