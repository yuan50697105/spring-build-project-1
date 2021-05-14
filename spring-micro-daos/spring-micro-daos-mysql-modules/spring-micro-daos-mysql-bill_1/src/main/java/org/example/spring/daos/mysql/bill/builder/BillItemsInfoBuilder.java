package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.table.dto.BillItemsInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.BillItemsInfo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface BillItemsInfoBuilder {
    BillItemsInfoBuilder INSTANCE = Mappers.getMapper(BillItemsInfoBuilder.class);

    void copy(BillItemsInfo billItemsInfo, @MappingTarget BillItemsInfoDTO billItemsInfoDTO);

    BillItemsInfo toPO(BillItemsInfoDTO billItemsInfoDTO);

}
