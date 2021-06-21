package org.example.spring.repositories.mysql.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.po.Resource;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.mysql.auth.table.po.TResource;
import org.example.spring.repositories.mysql.auth.table.query.TResourceQuery;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface ResourceConverter extends ICommonsConverter<Resource, TResource, ResourceQuery, TResourceQuery, ResourceVo, ResourceDTO> {
}
