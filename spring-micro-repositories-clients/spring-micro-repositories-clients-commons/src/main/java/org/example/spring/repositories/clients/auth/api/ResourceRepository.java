package org.example.spring.repositories.clients.auth.api;

import org.example.spring.repositories.clients.commons.api.CommonsRepository;
import org.example.spring.repositories.commons.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.auth.po.Resource;
import org.example.spring.repositories.commons.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.auth.vo.ResourceVo;

public interface ResourceRepository extends CommonsRepository<Resource, ResourceVo, ResourceDTO, ResourceQuery> {
}
