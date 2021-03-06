package org.example.spring.repositories.customer.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.oracle.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.oracle.table.po.TPotentialCustomers;
import org.example.spring.repositories.customer.oracle.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.oracle.table.vo.TPotentialCustomersVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TPotentialCustomersConverter extends IBaseConverter<TPotentialCustomers, TPotentialCustomersDTO, TPotentialCustomersVo, TPotentialCustomersQuery> {
    TPotentialCustomersConverter CONVERTER = Mappers.getMapper(TPotentialCustomersConverter.class);
}
