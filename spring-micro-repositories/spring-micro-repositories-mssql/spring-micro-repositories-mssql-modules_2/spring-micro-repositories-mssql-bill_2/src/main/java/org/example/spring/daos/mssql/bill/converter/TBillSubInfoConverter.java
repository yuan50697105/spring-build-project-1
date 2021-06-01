package org.example.spring.daos.mssql.bill.converter;

import org.example.spring.daos.mssql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.daos.mssql.bill.table.po.TBillSubInfo;
import org.example.spring.daos.mssql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.daos.mssql.bill.table.vo.TBillSubInfoVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillSubInfoConverter extends IBaseConverter<TBillSubInfo, TBillSubInfoDTO, TBillSubInfoVo, TBillSubInfoQuery> {
    TBillSubInfoConverter instance = Mappers.getMapper(TBillSubInfoConverter.class);
}
