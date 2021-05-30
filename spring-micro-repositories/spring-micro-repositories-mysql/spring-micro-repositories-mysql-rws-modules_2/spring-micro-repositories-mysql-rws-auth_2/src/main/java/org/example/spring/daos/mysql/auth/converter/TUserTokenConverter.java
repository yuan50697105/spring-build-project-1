package org.example.spring.daos.mysql.auth.converter;

import org.example.spring.daos.mysql.auth.table.dto.TUserTokenDto;
import org.example.spring.daos.mysql.auth.table.po.TUserToken;
import org.example.spring.daos.mysql.auth.table.query.TUserTokenQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserTokenVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TUserTokenConverter extends IBaseConverter<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
    TUserTokenConverter CONVERTER = Mappers.getMapper(TUserTokenConverter.class);
}
