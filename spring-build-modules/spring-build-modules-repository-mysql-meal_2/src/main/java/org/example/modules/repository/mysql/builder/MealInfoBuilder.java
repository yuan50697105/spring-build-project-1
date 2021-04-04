package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.vo.MealItemVo;
import org.example.modules.repository.mysql.table.po.TMealInfo;
import org.example.modules.repository.mysql.entity.query.MealInfoQuery;
import org.example.modules.repository.mysql.table.po.TMealItem;
import org.example.modules.repository.mysql.table.query.TMealInfoQuery;
import org.example.modules.repository.mysql.entity.result.MealInfo;
import org.example.modules.repository.mysql.entity.vo.MealInfoVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface MealInfoBuilder {
    MealInfo build(TMealInfo meal);

    void copy(MealInfoVo meal, @MappingTarget TMealInfo mealInfo);

    TMealInfoQuery build(MealInfoQuery mealInfoQuery);

    IPageData<MealInfo> build(IPageData<TMealInfo> data);

    List<MealInfo> build(List<TMealInfo> data);

    default List<TMealItem> build(TMealInfo mealInfo, List<MealItemVo> items) {
        ArrayList<TMealItem> mealItems = new ArrayList<>();
        for (MealItemVo item : items) {
            mealItems.add(buildOne(mealInfo, item));
        }
        return mealItems;
    }

    TMealItem buildOne(TMealInfo mealInfo, MealItemVo item);

}
