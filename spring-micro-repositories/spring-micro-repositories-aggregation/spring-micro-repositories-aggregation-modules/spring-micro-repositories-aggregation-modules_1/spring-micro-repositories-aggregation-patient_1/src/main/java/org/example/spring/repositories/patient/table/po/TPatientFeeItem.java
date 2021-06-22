package org.example.spring.repositories.patient.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_patient_fee_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientFeeItem extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    private Long patientId;
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
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;
    /**
     * patientMealId
     */
    @ApiModelProperty(value = "patientMealId")
    private Long patientMealId;
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