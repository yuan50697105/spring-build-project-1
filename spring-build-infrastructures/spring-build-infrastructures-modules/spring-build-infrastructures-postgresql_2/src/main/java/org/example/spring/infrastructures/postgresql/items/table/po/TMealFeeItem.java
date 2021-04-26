package org.example.spring.infrastructures.postgresql.items.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@ApiModel(value = "org-example-spring-infrastructures-postgresql-items-table-po-TMealFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TMealFeeItem extends IBaseEntity implements Serializable {
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