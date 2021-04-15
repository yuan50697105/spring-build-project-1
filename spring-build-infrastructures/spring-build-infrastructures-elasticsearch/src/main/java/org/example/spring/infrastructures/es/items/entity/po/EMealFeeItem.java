package org.example.spring.infrastructures.es.items.entity.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.elasticsearch.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class EMealFeeItem extends IBaseEntity {
    private Long mealId;
    private Long feeItemId;
}