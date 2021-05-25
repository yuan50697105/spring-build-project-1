package org.example.spring.daos.mysql.bill.builder;

import org.example.spring.daos.mysql.bill.entity.dto.BillSubInfoDTO;
import org.example.spring.daos.mysql.bill.entity.dto.BillSubInfoDetailsDTO;
import org.example.spring.daos.mysql.bill.entity.query.BillSubInfoQuery;
import org.example.spring.daos.mysql.bill.entity.vo.BillSubInfoVo;
import org.example.spring.daos.mysql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.daos.mysql.bill.table.dto.TBillSubInfoDetailsDTO;
import org.example.spring.daos.mysql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.daos.mysql.bill.table.vo.TBillSubInfoVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface BillSubInfoClientBuilder {
    BillSubInfoClientBuilder instance = Mappers.getMapper(BillSubInfoClientBuilder.class);

    TBillSubInfoVo build(BillSubInfoVo vo);

    BillSubInfoDTO build(TBillSubInfoDTO tBillSubInfoDTO);

    BillSubInfoDetailsDTO build2(TBillSubInfoDetailsDTO details);

    @Mapping(target = "withSize", ignore = true)
    @Mapping(target = "withPage", ignore = true)
    @Mapping(target = "withOrderType", ignore = true)
    @Mapping(target = "withOrder", ignore = true)
    TBillSubInfoQuery build(BillSubInfoQuery query);

    List<BillSubInfoDTO> build(List<TBillSubInfoDTO> selectList);

    IPageData<BillSubInfoDTO> build(IPageData<TBillSubInfoDTO> selectPage);
}
