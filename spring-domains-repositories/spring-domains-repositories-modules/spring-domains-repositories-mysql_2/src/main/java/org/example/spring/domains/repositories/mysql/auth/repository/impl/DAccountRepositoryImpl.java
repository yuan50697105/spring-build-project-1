package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import org.example.spring.daos.mysql.auth.repository.TResourceRepository;
import org.example.spring.daos.mysql.auth.repository.TRoleRepository;
import org.example.spring.daos.mysql.auth.repository.impl.TUserRepositoryImpl;
import org.example.spring.daos.mysql.auth.repository.impl.TUserRepositoryImpl;
import org.example.spring.domains.repositories.mysql.auth.repository.DAccountRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Primary
public class DAccountRepositoryImpl extends TUserRepositoryImpl implements DAccountRepository {
    private final TRoleRepository roleRepository;
    private final TResourceRepository resourceRepository;

    public DAccountRepositoryImpl(TRoleRepository roleRepository, TResourceRepository resourceRepository) {
        super(roleRepository, resourceRepository);
        this.roleRepository = roleRepository;
        this.resourceRepository = resourceRepository;
    }
}