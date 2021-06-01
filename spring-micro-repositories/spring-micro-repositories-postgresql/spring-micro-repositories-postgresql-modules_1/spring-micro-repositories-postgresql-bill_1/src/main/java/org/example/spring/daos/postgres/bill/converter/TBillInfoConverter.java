package org.example.spring.daos.postgres.bill.converter;

import org.example.spring.daos.postgres.bill.table.dto.TBillInfoDTO;
import org.example.spring.daos.postgres.bill.table.po.TBillInfo;
import org.example.spring.daos.postgres.bill.table.query.TBillInfoQuery;
import org.example.spring.daos.postgres.bill.table.vo.TBillInfoVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillInfoConverter extends IBaseConverter<TBillInfo, TBillInfoDTO, TBillInfoVo, TBillInfoQuery> {
    TBillInfoConverter instance = Mappers.getMapper(TBillInfoConverter.class);
}
