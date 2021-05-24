package org.example.spring.daos.mssql.auth.converter;

import org.example.spring.daos.mssql.auth.table.dto.TUserDto;
import org.example.spring.daos.mssql.auth.table.po.TUser;
import org.example.spring.daos.mssql.auth.table.query.TUserQuery;
import org.example.spring.daos.mssql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface TUserConverter extends IBaseConverter<TUser, TUserDto, TUserVo, TUserQuery> {
}
