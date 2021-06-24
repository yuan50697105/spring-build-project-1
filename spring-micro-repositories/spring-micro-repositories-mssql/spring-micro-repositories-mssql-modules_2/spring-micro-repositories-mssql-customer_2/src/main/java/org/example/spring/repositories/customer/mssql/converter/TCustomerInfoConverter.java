package org.example.spring.repositories.customer.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TCustomerInfoConverter extends IBaseConverter<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
    TCustomerInfoConverter CONVERTER = Mappers.getMapper(TCustomerInfoConverter.class);
}
