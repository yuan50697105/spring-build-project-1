package org.example.spring.infrastructures.mysql.items.table.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class TMealFeeItem extends IBaseEntity {
    private Long mealId;
    private Long feeItemId;
}