package org.example.spring.repositories.customer.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.postgres.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.customer.postgres.table.po.TSellerInfo;
import org.example.spring.repositories.customer.postgres.table.query.TSellerInfoQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TSellerInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TSellerInfoConverter extends IBaseConverter<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
    TSellerInfoConverter CONVERTER = Mappers.getMapper(TSellerInfoConverter.class);
}
