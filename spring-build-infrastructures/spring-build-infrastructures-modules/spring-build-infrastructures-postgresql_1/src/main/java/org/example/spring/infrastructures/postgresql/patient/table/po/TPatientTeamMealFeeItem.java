package org.example.spring.infrastructures.postgresql.patient.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "org-example-spring-infrastructures-postgresql-patient-table-po-TPatientTeamMealFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamMealFeeItem extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
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
    @ApiModelProperty(value = "patientId")
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
}