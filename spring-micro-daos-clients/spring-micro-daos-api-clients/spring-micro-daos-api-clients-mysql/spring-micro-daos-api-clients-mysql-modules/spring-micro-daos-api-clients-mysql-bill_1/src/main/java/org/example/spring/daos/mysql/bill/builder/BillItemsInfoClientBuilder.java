package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.entity.dto.BillItemsInfoDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillItemsInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillInfoVo;
import org.example.spring.daos.mysql.bill.entity.vo.BillItemsInfoVo;
import org.example.spring.daos.mysql.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.daos.mysql.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface BillItemsInfoClientBuilder {
    BillItemsInfoClientBuilder INSTANCE = Mappers.getMapper(BillItemsInfoClientBuilder.class);

    TBillItemsInfoVo build(BillItemsInfoVo vo);

    BillItemsInfoDTO build(TBillItemsInfoDTO tBillItemsInfoDTO);

    TBillItemsInfoQuery build(BillItemsInfoQuery query);

    List<BillItemsInfoDTO> build(List<TBillItemsInfoDTO> queryList);

    IPageData<BillItemsInfoDTO> build(IPageData<TBillItemsInfoDTO> queryPage);

    TBillItemsInfoVo build(BillInfoVo vo);
}
