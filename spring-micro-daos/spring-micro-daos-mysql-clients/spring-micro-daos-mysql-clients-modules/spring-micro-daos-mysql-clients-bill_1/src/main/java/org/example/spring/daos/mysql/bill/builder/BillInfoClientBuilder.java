package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.entity.dto.BillInfoDTO;
import org.example.spring.daos.mysql.bill.entity.dto.BillInfoDetailsDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillInfoVo;
import org.example.spring.daos.mysql.bill.table.dto.TBillInfoDTO;
import org.example.spring.daos.mysql.bill.table.dto.TBillInfoDetailsDTO;
import org.example.spring.daos.mysql.bill.table.query.TBillInfoQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillInfoVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface BillInfoClientBuilder {
    BillInfoClientBuilder INSTANCE = Mappers.getMapper(BillInfoClientBuilder.class);

    TBillInfoVo build(BillInfoVo vo);

    BillInfoDTO build(TBillInfoDTO tBillInfoDTO);

    BillInfoDetailsDTO build2(TBillInfoDetailsDTO details);

    @Mapping(target = "withSize", ignore = true)
    @Mapping(target = "withPage", ignore = true)
    @Mapping(target = "withOrderType", ignore = true)
    @Mapping(target = "withOrder", ignore = true)
    TBillInfoQuery build(BillInfoQuery query);

    List<BillInfoDTO> build(List<TBillInfoDTO> queryList);

    IPageData<BillInfoDTO> build(IPageData<TBillInfoDTO> queryPage);
}
