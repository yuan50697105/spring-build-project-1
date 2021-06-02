package org.example.spring.repositories.mssql.customer.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mssql.customer.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.mssql.customer.table.po.TCustomerInfo;
import org.example.spring.repositories.mssql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TCustomerInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TCustomerInfoConverter extends IBaseConverter<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
    TCustomerInfoConverter CONVERTER = Mappers.getMapper(TCustomerInfoConverter.class);
}
