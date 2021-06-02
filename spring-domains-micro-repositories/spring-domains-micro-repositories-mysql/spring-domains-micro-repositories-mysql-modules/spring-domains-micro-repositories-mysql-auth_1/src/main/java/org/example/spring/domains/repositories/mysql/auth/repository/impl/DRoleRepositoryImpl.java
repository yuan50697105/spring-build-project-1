package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import org.example.spring.domains.repositories.mysql.auth.repository.DRoleRepository;
import org.example.spring.repositories.mysql.auth.repository.TResourceRepository;
import org.example.spring.repositories.mysql.auth.repository.impl.TRoleRepositoryImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Primary
public class DRoleRepositoryImpl extends TRoleRepositoryImpl implements DRoleRepository {
    private final TResourceRepository resourceRepository;

    public DRoleRepositoryImpl(TResourceRepository resourceRepository) {
        super(resourceRepository);
        this.resourceRepository = resourceRepository;
    }
}