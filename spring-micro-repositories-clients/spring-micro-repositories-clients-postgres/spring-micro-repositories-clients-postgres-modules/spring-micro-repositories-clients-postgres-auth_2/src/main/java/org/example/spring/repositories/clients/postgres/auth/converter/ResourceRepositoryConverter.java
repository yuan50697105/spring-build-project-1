package org.example.spring.repositories.clients.postgres.auth.converter;

import cn.hutool.core.lang.tree.Tree;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.auth.dto.ResourceDTO;
import org.example.spring.repositories.commons.entity.auth.query.ResourceQuery;
import org.example.spring.repositories.commons.entity.auth.vo.ResourceVo;
import org.example.spring.repositories.postgres.auth.table.dto.TResourceDTO;
import org.example.spring.repositories.postgres.auth.table.query.TResourceQuery;
import org.example.spring.repositories.postgres.auth.table.vo.TResourceVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface ResourceRepositoryConverter {
    ResourceRepositoryConverter CONVERTER = Mappers.getMapper(ResourceRepositoryConverter.class);

    TResourceVo build(ResourceVo vo);

    ResourceDTO build(TResourceDTO tResourceDTO);

    TResourceQuery build(ResourceQuery query);

    List<ResourceDTO> build(List<TResourceDTO> queryList);

    IPageData<ResourceDTO> build(IPageData<TResourceDTO> queryPage);

    Stream<ResourceDTO> build(Stream<TResourceDTO> queryStream);

    Tree<Long> copyToTree(TResourceDTO tResourceDTO);
}
