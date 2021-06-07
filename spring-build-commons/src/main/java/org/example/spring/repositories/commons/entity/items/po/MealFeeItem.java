package org.example.spring.repositories.commons.entity.items.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;

/**
 * t_meal_fee_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-items-table-po-TMealFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class MealFeeItem extends ICommonsEntity implements Serializable {
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;

    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    private Long feeItemId;
}