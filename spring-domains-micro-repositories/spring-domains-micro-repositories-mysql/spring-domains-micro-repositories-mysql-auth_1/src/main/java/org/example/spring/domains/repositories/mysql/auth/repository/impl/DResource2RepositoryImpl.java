package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import org.example.spring.daos.mysql.auth.repository.impl.TResource2RepositoryImpl;
import org.example.spring.domains.repositories.mysql.auth.repository.DResource2Repository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Primary
public class DResource2RepositoryImpl extends TResource2RepositoryImpl implements DResource2Repository {
}