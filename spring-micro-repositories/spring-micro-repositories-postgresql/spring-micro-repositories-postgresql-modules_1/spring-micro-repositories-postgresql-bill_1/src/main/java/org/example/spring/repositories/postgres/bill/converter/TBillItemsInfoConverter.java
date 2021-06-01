package org.example.spring.repositories.postgres.bill.converter;

import org.example.spring.repositories.postgres.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.postgres.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.postgres.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.postgres.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillItemsInfoConverter extends IBaseConverter<TBillItemsInfo, TBillItemsInfoDTO, TBillItemsInfoVo, TBillItemsInfoQuery> {
    TBillItemsInfoConverter instance = Mappers.getMapper(TBillItemsInfoConverter.class);
}
