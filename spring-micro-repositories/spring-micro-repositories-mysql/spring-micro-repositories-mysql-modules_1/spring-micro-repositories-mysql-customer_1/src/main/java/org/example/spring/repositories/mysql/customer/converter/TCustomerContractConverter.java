package org.example.spring.repositories.mysql.customer.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.mysql.customer.table.po.TCustomerContract;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerContractVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TCustomerContractConverter extends IBaseConverter<TCustomerContract, TCustomerContractDTO, TCustomerContractVo, TCustomerContractQuery> {
    TCustomerContractConverter CONVERTER = Mappers.getMapper(TCustomerContractConverter.class);
}
