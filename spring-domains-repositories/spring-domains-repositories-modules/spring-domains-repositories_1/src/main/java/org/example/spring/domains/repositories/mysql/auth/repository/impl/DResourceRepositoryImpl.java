package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import org.example.spring.repositories.mysql.auth.repository.impl.TResourceRepositoryImpl;
import org.example.spring.domains.repositories.mysql.auth.repository.DResourceRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Primary
public class DResourceRepositoryImpl extends TResourceRepositoryImpl implements DResourceRepository {
}