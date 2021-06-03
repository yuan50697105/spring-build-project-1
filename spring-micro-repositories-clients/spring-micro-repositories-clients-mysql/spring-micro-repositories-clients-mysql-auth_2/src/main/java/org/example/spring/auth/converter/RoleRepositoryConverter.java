package org.example.spring.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.auth.dto.RoleDTO;
import org.example.spring.repositories.commons.auth.query.RoleQuery;
import org.example.spring.repositories.commons.auth.vo.RoleVo;
import org.example.spring.repositories.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.repositories.mysql.auth.table.query.TRoleQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TRoleVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface RoleRepositoryConverter {
    RoleRepositoryConverter CONVERTER = Mappers.getMapper(RoleRepositoryConverter.class);

    TRoleVo build(RoleVo vo);

    RoleDTO build(TRoleDTO tRoleDTO);

    TRoleQuery build(RoleQuery query);

    List<RoleDTO> build(List<TRoleDTO> queryList);

    IPageData<RoleDTO> build(IPageData<TRoleDTO> queryPage);
}
