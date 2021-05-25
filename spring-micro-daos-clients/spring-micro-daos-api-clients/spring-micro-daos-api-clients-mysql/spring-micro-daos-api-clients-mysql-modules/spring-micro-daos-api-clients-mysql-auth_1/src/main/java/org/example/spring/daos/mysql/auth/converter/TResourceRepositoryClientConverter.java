package org.example.spring.daos.mysql.auth.converter;

import org.example.spring.daos.mysql.auth.entity.dto.ResourceDTO;
import org.example.spring.daos.mysql.auth.entity.query.ResourceQuery;
import org.example.spring.daos.mysql.auth.entity.vo.ResourceVo;
import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TResourceRepositoryClientConverter {
    TResourceRepositoryClientConverter instance = Mappers.getMapper(TResourceRepositoryClientConverter.class);

    TResourceVo build(ResourceVo resourceVo);

    ResourceDTO build(TResourceDTO tResourceDTO);

    TResourceQuery build(ResourceQuery query);

    List<ResourceDTO> build(List<TResourceDTO> resourceList);

    IPageData<ResourceDTO> build(IPageData<TResourceDTO> pageData);
}
