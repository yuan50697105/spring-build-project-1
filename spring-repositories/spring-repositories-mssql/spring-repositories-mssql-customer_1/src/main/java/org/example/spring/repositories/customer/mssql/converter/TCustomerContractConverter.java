package org.example.spring.repositories.customer.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.mssql.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.mssql.table.po.TCustomerContract;
import org.example.spring.repositories.customer.mssql.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TCustomerContractVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TCustomerContractConverter extends IBaseConverter<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
    TCustomerContractConverter CONVERTER = Mappers.getMapper(TCustomerContractConverter.class);
}
