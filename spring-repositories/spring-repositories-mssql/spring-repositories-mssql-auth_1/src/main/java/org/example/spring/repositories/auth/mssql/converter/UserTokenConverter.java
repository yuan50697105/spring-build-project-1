package org.example.spring.repositories.auth.mssql.converter;


import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.auth.mssql.table.po.TUserToken;
import org.example.spring.repositories.auth.mssql.table.query.TUserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.po.UserToken;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface UserTokenConverter extends ICommonsConverter<UserToken, TUserToken, UserTokenQuery, TUserTokenQuery, UserTokenVo, UserTokenDto> {
}
