package org.example.spring.repositories.bill.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.bill.oracle.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.oracle.table.po.TBillLog;
import org.example.spring.repositories.bill.oracle.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.oracle.table.vo.TBillLogVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillLogConverter extends IBaseConverter<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
    TBillLogConverter instance = Mappers.getMapper(TBillLogConverter.class);
}
