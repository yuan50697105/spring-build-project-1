package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.table.dto.TBillInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillInfo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(config = BaseBuilder.class)
public interface BillInfoBuilder {
    BillInfoBuilder INSTANCE = getMapper(BillInfoBuilder.class);

    TBillInfo toPo(TBillInfoDTO billInfoDTO);
}
