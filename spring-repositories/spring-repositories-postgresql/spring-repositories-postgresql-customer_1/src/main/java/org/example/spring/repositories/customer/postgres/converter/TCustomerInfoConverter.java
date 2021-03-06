package org.example.spring.repositories.customer.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.postgres.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.customer.postgres.table.po.TCustomerInfo;
import org.example.spring.repositories.customer.postgres.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TCustomerInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TCustomerInfoConverter extends IBaseConverter<TCustomerInfo, TCustomerInfoDTO, TCustomerInfoVo, TCustomerInfoQuery> {
    TCustomerInfoConverter CONVERTER = Mappers.getMapper(TCustomerInfoConverter.class);
}
