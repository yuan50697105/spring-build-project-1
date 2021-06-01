package org.example.spring.repositories.mssql.bill.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.mssql.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.mssql.bill.table.po.TBillLog;
import org.example.spring.repositories.mssql.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.mssql.bill.table.vo.TBillLogVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillLogConverter extends IBaseConverter<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
    TBillLogConverter instance = Mappers.getMapper(TBillLogConverter.class);
}
