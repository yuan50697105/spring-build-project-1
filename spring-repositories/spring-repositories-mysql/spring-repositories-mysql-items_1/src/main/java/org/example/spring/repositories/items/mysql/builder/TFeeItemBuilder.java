package org.example.spring.repositories.items.mysql.builder;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.items.mysql.table.dto.TCheckItemDTO;
import org.example.spring.repositories.items.mysql.table.dto.TFeeCheckItemDTO;
import org.example.spring.repositories.items.mysql.table.dto.TFeeItemDTO;
import org.example.spring.repositories.items.mysql.table.po.TFeeItem;
import org.example.spring.repositories.items.mysql.table.vo.TFeeItemVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

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
