package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.table.dto.BillInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.BillInfo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(config = BaseBuilder.class)
public interface BillInfoBuilder {
    BillInfoBuilder INSTANCE = getMapper(BillInfoBuilder.class);

    BillInfo toPo(BillInfoDTO billInfoDTO);
}
