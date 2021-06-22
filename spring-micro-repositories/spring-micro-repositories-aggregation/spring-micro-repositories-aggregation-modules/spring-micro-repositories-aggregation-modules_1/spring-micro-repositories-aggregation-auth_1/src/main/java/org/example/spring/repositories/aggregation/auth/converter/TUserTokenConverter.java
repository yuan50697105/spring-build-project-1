package org.example.spring.repositories.aggregation.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.aggregation.auth.table.dto.TUserTokenDto;
import org.example.spring.repositories.aggregation.auth.table.po.TUserToken;
import org.example.spring.repositories.aggregation.auth.table.query.TUserTokenQuery;
import org.example.spring.repositories.aggregation.auth.table.vo.TUserTokenVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
@Deprecated
public interface TUserTokenConverter extends IBaseConverter<TUserToken, TUserTokenDto, TUserTokenVo, TUserTokenQuery> {
    TUserTokenConverter CONVERTER = Mappers.getMapper(TUserTokenConverter.class);
}
