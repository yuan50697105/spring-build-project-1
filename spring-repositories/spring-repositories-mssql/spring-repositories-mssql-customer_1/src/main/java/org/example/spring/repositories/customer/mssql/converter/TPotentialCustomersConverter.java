package org.example.spring.repositories.customer.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.mssql.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.mssql.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.mssql.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TPotentialCustomersVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TPotentialCustomersConverter extends IBaseConverter<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
    TPotentialCustomersConverter CONVERTER = Mappers.getMapper(TPotentialCustomersConverter.class);
}
