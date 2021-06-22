package org.example.spring.repositories.auth.dao;

import org.example.spring.repositories.auth.table.po.TResource;

import java.util.List;

public interface TUserResourceDao {
    List<TResource> listResourceByUserId(Long userId);
}
