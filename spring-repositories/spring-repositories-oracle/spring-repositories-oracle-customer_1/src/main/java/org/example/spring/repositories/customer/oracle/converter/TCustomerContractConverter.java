package org.example.spring.repositories.customer.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.oracle.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.customer.oracle.table.po.TCustomerContract;
import org.example.spring.repositories.customer.oracle.table.query.TCustomerContractQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TCustomerContractVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TCustomerContractConverter extends IBaseConverter<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
    TCustomerContractConverter CONVERTER = Mappers.getMapper(TCustomerContractConverter.class);
}
