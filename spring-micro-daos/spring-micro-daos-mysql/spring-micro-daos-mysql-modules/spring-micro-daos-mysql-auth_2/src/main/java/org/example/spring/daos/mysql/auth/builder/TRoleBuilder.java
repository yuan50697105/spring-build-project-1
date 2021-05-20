package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TRoleBuilder {
    TRoleBuilder instance = Mappers.getMapper(TRoleBuilder.class);

    List<TRoleDTO> buildRole(List<TRole> queryListByDepartmentId);

    TRole buildRole(TRoleVo vo);

    void copy(TRoleVo vo, @MappingTarget TRole tRole);

    TRoleDTO buildRole(TRole byId);

    IPageData<TRoleDTO> buildRole(IPageData<TRole> selectPage);
}
