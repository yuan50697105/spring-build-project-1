package org.example.spring.repositories.bill.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.bill.mysql.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillSubInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillSubInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillSubInfoConverter extends IBaseConverter<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
    TBillSubInfoConverter instance = Mappers.getMapper(TBillSubInfoConverter.class);
}