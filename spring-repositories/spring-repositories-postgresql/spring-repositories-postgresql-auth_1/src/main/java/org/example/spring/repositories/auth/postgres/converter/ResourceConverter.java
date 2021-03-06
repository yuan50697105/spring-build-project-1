package org.example.spring.repositories.auth.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.auth.postgres.table.po.TResource;
import org.example.spring.repositories.auth.postgres.table.query.TResourceQuery;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface ResourceConverter extends ICommonsConverter<Resource, TResource, ResourceQuery, TResourceQuery, ResourceVo, ResourceDTO> {
}
