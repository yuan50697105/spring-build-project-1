package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import org.example.spring.daos.mysql.auth.repository.TResource2Repository;
import org.example.spring.daos.mysql.auth.repository.TRole2Repository;
import org.example.spring.daos.mysql.auth.repository.impl.TUser2RepositoryImpl;
import org.example.spring.domains.repositories.mysql.auth.repository.DAccountRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Primary
public class DAccountRepositoryImpl extends TUser2RepositoryImpl implements DAccountRepository {
    private final TRole2Repository role2Repository;
    private final TResource2Repository resource2Repository;

    public DAccountRepositoryImpl(TRole2Repository role2Repository, TResource2Repository resource2Repository) {
        super(role2Repository, resource2Repository);
        this.role2Repository = role2Repository;
        this.resource2Repository = resource2Repository;
    }
}