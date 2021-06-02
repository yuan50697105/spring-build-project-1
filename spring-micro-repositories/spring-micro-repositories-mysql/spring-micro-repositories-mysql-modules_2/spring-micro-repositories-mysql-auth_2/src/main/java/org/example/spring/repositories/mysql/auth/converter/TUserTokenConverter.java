package org.example.spring.repositories.mysql.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mysql.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.mysql.auth.table.po.TUserToken;
import org.example.spring.repositories.mysql.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.mysql.auth.table.vo.TUserTokenVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TUserTokenConverter extends IBaseConverter<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
    TUserTokenConverter CONVERTER = Mappers.getMapper(TUserTokenConverter.class);
}
