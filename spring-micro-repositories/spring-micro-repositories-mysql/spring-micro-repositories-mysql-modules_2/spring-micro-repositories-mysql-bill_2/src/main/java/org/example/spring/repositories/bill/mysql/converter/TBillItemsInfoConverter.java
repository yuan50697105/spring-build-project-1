package org.example.spring.repositories.bill.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.bill.mysql.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.mysql.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.mysql.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillItemsInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillItemsInfoConverter extends IBaseConverter<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
    TBillItemsInfoConverter instance = Mappers.getMapper(TBillItemsInfoConverter.class);
}
