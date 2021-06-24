package org.example.spring.repositories.bill.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.bill.mssql.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.bill.mssql.table.po.TBillItemsInfo;
import org.example.spring.repositories.bill.mssql.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.bill.mssql.table.vo.TBillItemsInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillItemsInfoConverter extends IBaseConverter<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
    TBillItemsInfoConverter instance = Mappers.getMapper(TBillItemsInfoConverter.class);
}
