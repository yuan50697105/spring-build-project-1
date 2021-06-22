package org.example.spring.repositories.aggregation.bill.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.aggregation.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.aggregation.bill.table.po.TBillInfo;
import org.example.spring.repositories.aggregation.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.aggregation.bill.table.vo.TBillInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillInfoConverter extends IBaseConverter<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
    TBillInfoConverter instance = Mappers.getMapper(TBillInfoConverter.class);
}
