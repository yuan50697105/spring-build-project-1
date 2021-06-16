package org.example.spring.repositories.clients.dubbo.commons;

import org.example.spring.plugins.commons.entity.ICommonsEntity;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;

public abstract class CommonsDubboRepositoryImpl<T extends ICommonsEntity, V extends T, D extends T, Q extends ICommonsQuery, R extends CommonsRepository<T, V, D, Q>> implements CommonsDubboRepository {
}