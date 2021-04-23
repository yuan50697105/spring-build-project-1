package org.example.spring.infrastructures.clickhouse.patient.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_patient_team_meal_fee_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientTeamMealFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamMealFeeItem extends IBaseEntity implements Serializable {
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;

    /**
     * teamMealId
     */
    @ApiModelProperty(value = "teamMealId")
    private Long teamMealId;

    /**
     * patientId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;

    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    private Long feeItemId;
    /**
     * feeItemCode
     */
    @ApiModelProperty(value = "feeItemCode")
    private String feeItemCode;

    /**
     * feeItemName
     */
    @ApiModelProperty(value = "feeItemName")
    private String feeItemName;

    /**
     * price
     */
    @ApiModelProperty(value = "price")
    private BigDecimal price;

    /**
     * disPrice
     */
    @ApiModelProperty(value = "disPrice")
    private BigDecimal disPrice;

    /**
     * marketPrice
     */
    @ApiModelProperty(value = "marketPrice")
    private BigDecimal marketPrice;

    /**
     * source
     */
    @ApiModelProperty(value = "source")
    private String source;

    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;

    private static final long serialVersionUID = 1L;
}