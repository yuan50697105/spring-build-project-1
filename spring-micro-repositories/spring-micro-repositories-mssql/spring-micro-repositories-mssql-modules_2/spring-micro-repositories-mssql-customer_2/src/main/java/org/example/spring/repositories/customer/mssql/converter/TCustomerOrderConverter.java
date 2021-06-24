package org.example.spring.repositories.customer.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerOrder;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerOrderVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TCustomerOrderConverter extends IBaseConverter<TCustomerOrder, TCustomerOrderDTO, TCustomerOrderVo, TCustomerOrderQuery> {
    TCustomerOrderConverter CONVERTER = Mappers.getMapper(TCustomerOrderConverter.class);
}
