package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import org.example.spring.daos.mysql.auth.builder.TResourceBuilder;
import org.example.spring.daos.mysql.auth.builder.TRoleBuilder;
import org.example.spring.daos.mysql.auth.repository.TResource2Repository;
import org.example.spring.daos.mysql.auth.repository.TRole2Repository;
import org.example.spring.daos.mysql.auth.repository.impl.TRole2RepositoryImpl;
import org.example.spring.domains.repositories.mysql.auth.repository.DRole2Repository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Primary
public class DRole2RepositoryImpl extends TRole2RepositoryImpl implements DRole2Repository {
    private final TRoleBuilder roleBuilder;
    private final TResourceBuilder resourceBuilder;
    private final TResource2Repository resource2Repository;

    public DRole2RepositoryImpl(TRoleBuilder roleBuilder, TResourceBuilder resourceBuilder, TResource2Repository resource2Repository) {
        super(roleBuilder, resourceBuilder, resource2Repository);
        this.roleBuilder = roleBuilder;
        this.resourceBuilder = resourceBuilder;
        this.resource2Repository = resource2Repository;
    }
}