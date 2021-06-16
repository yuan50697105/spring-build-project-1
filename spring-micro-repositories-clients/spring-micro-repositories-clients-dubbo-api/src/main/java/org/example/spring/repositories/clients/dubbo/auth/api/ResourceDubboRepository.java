package org.example.spring.repositories.clients.dubbo.auth.api;


import org.example.spring.repositories.clients.dubbo.commons.api.CommonsDubboRepository;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;

public interface ResourceDubboRepository extends CommonsDubboRepository<Resource, ResourceVo, ResourceDTO, ResourceQuery> {
}
