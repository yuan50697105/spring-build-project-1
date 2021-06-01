package org.example.spring.repositories.mssql.bill.builder;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.mssql.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.mssql.bill.table.dto.TBillInfoDetailsDTO;
import org.example.spring.repositories.mssql.bill.table.dto.TBillSubInfoDetailsDTO;
import org.example.spring.repositories.mssql.bill.table.po.TBillInfo;
import org.example.spring.repositories.mssql.bill.table.vo.TBillInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TBillInfoBuilder {
    TBillInfoBuilder INSTANCE = Mappers.getMapper(TBillInfoBuilder.class);

    TBillInfo build(TBillInfoVo vo);

    void copy(TBillInfo billInfo, @MappingTarget TBillInfo tBillInfo);

    TBillInfoDTO build(TBillInfo byId);

    List<TBillInfoDTO> build(List<TBillInfo> queryList);

    IPageData<TBillInfoDTO> build(IPageData<TBillInfo> queryPage);

    TBillInfoDetailsDTO build(TBillInfoDTO tBillInfoDTO, List<TBillSubInfoDetailsDTO> subs);
}
