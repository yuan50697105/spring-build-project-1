package org.example.spring.repositories.mssql.customer.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mssql.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.mssql.customer.table.po.TSellerInfo;
import org.example.spring.repositories.mssql.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TSellerInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TSellerInfoConverter extends IBaseConverter<TSellerInfo, TSellerInfoDTO, TSellerInfoVo, TSellerInfoQuery> {
    TSellerInfoConverter CONVERTER = Mappers.getMapper(TSellerInfoConverter.class);
}
