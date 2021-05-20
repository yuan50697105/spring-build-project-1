package org.example.spring.daos.mysql.auth.converter;

import org.example.spring.daos.mysql.auth.builder.TRoleBuilder;
import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TRoleResourceDTO;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TRoleConverter extends IBaseConverter<TRole, TRoleDTO, TRoleVo, TRoleQuery> {
    TRoleBuilder instance = Mappers.getMapper(TRoleBuilder.class);

    TRoleResourceDTO buildDTO(TRoleDTO roleDTO, List<TResourceDTO> queryListByRoleId);

}
