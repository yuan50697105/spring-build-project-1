package org.example.spring.repositories.oracle.bill.builder;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.oracle.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.oracle.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.oracle.bill.table.dto.TBillSubInfoDetailsDTO;
import org.example.spring.repositories.oracle.bill.table.po.TBillItemsInfo;
import org.example.spring.repositories.oracle.bill.table.po.TBillSubInfo;
import org.example.spring.repositories.oracle.bill.table.vo.TBillSubInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(config = BaseBuilder.class)
public interface TBillSubInfoBuilder {
    TBillSubInfoBuilder INSTANCE = Mappers.getMapper(TBillSubInfoBuilder.class);

    TBillSubInfo build(TBillSubInfoVo vo);

    TBillSubInfoDTO build(TBillSubInfo byId);

    List<TBillSubInfoDTO> build(List<TBillSubInfo> queryList);

    IPageData<TBillSubInfoDTO> build(IPageData<TBillSubInfo> selectPage);

    TBillSubInfoDetailsDTO build(TBillSubInfoDTO tBillSubInfoDTO, List<TBillItemsInfoDTO> items);

    default List<TBillSubInfoDetailsDTO> build2(List<TBillSubInfoDTO> billSubInfoDTOS, List<TBillItemsInfoDTO> billItemsInfoDTOS) {
        ArrayList<TBillSubInfoDetailsDTO> tBillSubInfoDetailsDTOS = new ArrayList<>(billSubInfoDTOS.size());
        Map<Long, List<TBillItemsInfoDTO>> listMap = billItemsInfoDTOS.stream().collect(Collectors.groupingBy(TBillItemsInfo::getSubBillId));
        for (TBillSubInfoDTO tBillSubInfoDTO : billSubInfoDTOS) {
            tBillSubInfoDetailsDTOS.add(build(tBillSubInfoDTO, listMap.get(tBillSubInfoDTO.getId())));
        }
        return tBillSubInfoDetailsDTOS;
    }
}
