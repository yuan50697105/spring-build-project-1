package org.example.spring.repositories.oracle.bill.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.oracle.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.oracle.bill.table.po.TBillLog;
import org.example.spring.repositories.oracle.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.oracle.bill.table.vo.TBillLogVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillLogConverter extends IBaseConverter<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
    TBillLogConverter instance = Mappers.getMapper(TBillLogConverter.class);
}
