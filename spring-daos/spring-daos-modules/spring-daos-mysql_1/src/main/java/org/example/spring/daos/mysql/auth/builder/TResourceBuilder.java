package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TRoleResourceDTO;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface TResourceBuilder {
    TResourceBuilder instance = Mappers.getMapper(TResourceBuilder.class);

    @Mapping(target = "resources", ignore = true)
    TRoleResourceDTO toDetails(TRoleDTO roleDTO);

    TResource toPo(TResourceVo vo);

    void copy(TResource resource, @MappingTarget TResource tResource);

    TResourceDTO toDTO(TResource byId);

    List<TResourceDTO> toDTO(List<TResource> queryList);

    Stream<TResourceDTO> toDTO(Stream<TResource> queryListStream);

    IPageData<TResourceDTO> toDTO(IPageData<TResource> queryPage);
}
