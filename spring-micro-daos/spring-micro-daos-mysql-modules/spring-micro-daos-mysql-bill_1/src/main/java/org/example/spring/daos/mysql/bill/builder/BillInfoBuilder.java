package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.table.dto.BillInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.BillInfo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface BillInfoBuilder {
    BillInfoBuilder INSTANCE = Mappers.getMapper(BillInfoBuilder.class);

    void copy(BillInfo billInfo, @MappingTarget BillInfoDTO billInfoDTO);

    BillInfo toPo(BillInfoDTO billInfoDTO);
}
