package org.example.spring.daos.postgres.bill.builder;

import org.example.spring.daos.postgres.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.daos.postgres.bill.table.po.TBillItemsInfo;
import org.example.spring.daos.postgres.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TBillItemsInfoBuilder {
    TBillItemsInfoBuilder INSTANCE = Mappers.getMapper(TBillItemsInfoBuilder.class);

    TBillItemsInfo build(TBillItemsInfoVo vo);

    void copy(TBillItemsInfo billItemsInfo, @MappingTarget TBillItemsInfo tBillItemsInfo);

    TBillItemsInfoDTO build(TBillItemsInfo byId);

    List<TBillItemsInfoDTO> build(List<TBillItemsInfo> queryList);

    IPageData<TBillItemsInfoDTO> build(IPageData<TBillItemsInfo> selectPage);
}
