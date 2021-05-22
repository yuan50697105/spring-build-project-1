package org.example.spring.domains.repositories.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.repository.impl.TUser2RepositoryImpl;
import org.example.spring.domains.repositories.mysql.auth.repository.DAccount2Repository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
@Primary
public class DAccount2RepositoryImpl extends TUser2RepositoryImpl implements DAccount2Repository {
}