package org.example.spring.repositories.items.oracle.builder;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.repositories.items.oracle.table.po.TMealFeeItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TMealFeeItemBuilder {
    TMealFeeItemBuilder INSTANCE = Mappers.getMapper(TMealFeeItemBuilder.class);

    default List<TMealFeeItem> build(Long id, List<Long> feeItemIds) {
        ArrayList<TMealFeeItem> mealFeeItems = new ArrayList<>(feeItemIds.size());
        for (Long feeItemId : feeItemIds) {
            mealFeeItems.add(new TMealFeeItem(id, feeItemId));
        }
        return mealFeeItems;

    }
}
