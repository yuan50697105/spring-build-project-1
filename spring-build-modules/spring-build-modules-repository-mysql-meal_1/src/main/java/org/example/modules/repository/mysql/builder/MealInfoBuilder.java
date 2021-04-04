package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.table.po.TMealInfo;
import org.example.modules.repository.mysql.entity.query.MealInfoQuery;
import org.example.modules.repository.mysql.table.query.TMealInfoQuery;
import org.example.modules.repository.mysql.entity.result.MealInfo;
import org.example.modules.repository.mysql.entity.vo.MealInfoVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MealInfoBuilder {
    MealInfo build(TMealInfo meal);

    void copy(MealInfoVo meal, @MappingTarget TMealInfo mealInfo);

    TMealInfoQuery build(MealInfoQuery mealInfoQuery);

    IPageData<MealInfo> build(IPageData<TMealInfo> data);

    List<MealInfo> build(List<TMealInfo> data);
}
