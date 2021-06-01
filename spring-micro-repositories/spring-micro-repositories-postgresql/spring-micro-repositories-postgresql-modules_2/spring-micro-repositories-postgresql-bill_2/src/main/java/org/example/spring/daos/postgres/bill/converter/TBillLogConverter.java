package org.example.spring.daos.postgres.bill.converter;

import org.example.spring.daos.postgres.bill.table.dto.TBillLogDTO;
import org.example.spring.daos.postgres.bill.table.po.TBillLog;
import org.example.spring.daos.postgres.bill.table.query.TBillLogQuery;
import org.example.spring.daos.postgres.bill.table.vo.TBillLogVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillLogConverter extends IBaseConverter<TBillLog, TBillLogDTO, TBillLogVo, TBillLogQuery> {
    TBillLogConverter instance = Mappers.getMapper(TBillLogConverter.class);
}
