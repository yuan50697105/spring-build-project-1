package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.daos.mysql.bill.table.po.TBillItemsInfo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface BillItemsInfoBuilder {
    BillItemsInfoBuilder INSTANCE = Mappers.getMapper(BillItemsInfoBuilder.class);

    TBillItemsInfo toPO(TBillItemsInfoDTO billItemsInfoDTO);

}
