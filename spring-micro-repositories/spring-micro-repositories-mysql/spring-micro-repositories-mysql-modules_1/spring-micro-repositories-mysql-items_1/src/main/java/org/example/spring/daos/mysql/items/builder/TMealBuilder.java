package org.example.spring.daos.mysql.items.builder;

import org.example.spring.daos.mysql.items.table.dto.TFeeItemDTO;
import org.example.spring.daos.mysql.items.table.dto.TMealDTO;
import org.example.spring.daos.mysql.items.table.dto.TMealFeeItemDTO;
import org.example.spring.daos.mysql.items.table.po.TMeal;
import org.example.spring.daos.mysql.items.table.vo.TMealVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TMealBuilder {
    TMealBuilder INSTANCE = Mappers.getMapper(TMealBuilder.class);

    TMeal build(TMealVo vo);

    void copy(TMeal meal, @MappingTarget TMeal tMeal);

    TMealDTO build(TMeal byId);

    List<TMealDTO> build(List<TMeal> queryList);

    IPageData<TMealDTO> build(IPageData<TMeal> selectPage);

    TMealFeeItemDTO build(TMealDTO tMealDTO, List<TFeeItemDTO> items);
}
