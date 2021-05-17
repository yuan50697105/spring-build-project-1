package org.example.spring.daos.mysql.items.builder;

import org.example.spring.daos.mysql.items.table.dto.TCheckItemDTO;
import org.example.spring.daos.mysql.items.table.dto.TFeeCheckItemDTO;
import org.example.spring.daos.mysql.items.table.dto.TFeeItemDTO;
import org.example.spring.daos.mysql.items.table.po.TFeeItem;
import org.example.spring.daos.mysql.items.table.vo.TFeeItemVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TFeeItemBuilder {
    TFeeItemBuilder INSTANCE = Mappers.getMapper(TFeeItemBuilder.class);

    TFeeItem build(TFeeItemVo vo);

    void copy(TFeeItem feeItem, @MappingTarget TFeeItem tFeeItem);

    TFeeItemDTO build(TFeeItem byId);

    List<TFeeItemDTO> build(List<TFeeItem> queryList);

    IPageData<TFeeItemDTO> build(IPageData<TFeeItem> queryPage);

    TFeeCheckItemDTO build2(TFeeItemDTO tFeeItemDTO, List<TCheckItemDTO> items);
}