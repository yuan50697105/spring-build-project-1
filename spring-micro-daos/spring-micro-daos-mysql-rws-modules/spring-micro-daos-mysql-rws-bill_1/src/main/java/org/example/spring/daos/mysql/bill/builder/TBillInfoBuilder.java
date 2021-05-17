package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.table.po.TBillInfo;
import org.example.spring.daos.mysql.bill.table.vo.TBillInfoVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TBillInfoBuilder {
    TBillInfoBuilder INSTANCE = Mappers.getMapper(TBillInfoBuilder.class);

    TBillInfo build(TBillInfoVo vo);
}
