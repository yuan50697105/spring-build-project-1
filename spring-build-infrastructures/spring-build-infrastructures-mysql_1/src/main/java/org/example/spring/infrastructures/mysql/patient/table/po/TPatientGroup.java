package org.example.spring.infrastructures.mysql.patient.table.po;

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
 * t_patient_group
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientGroup")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientGroup extends IBaseEntity implements Serializable {
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    private Long customerId;

    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    private Long groupId;

    /**
     * personNum
     */
    @ApiModelProperty(value = "personNum")
    private Integer personNum;

    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;

    /**
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    private String mealName;

    /**
     * mealPrice
     */
    @ApiModelProperty(value = "mealPrice")
    private BigDecimal mealPrice;

    /**
     * mealDisPrice
     */
    @ApiModelProperty(value = "mealDisPrice")
    private BigDecimal mealDisPrice;

    /**
     * maxDisPrice
     */
    @ApiModelProperty(value = "maxDisPrice")
    private BigDecimal maxDisPrice;

    /**
     * maxDiscount
     */
    @ApiModelProperty(value = "maxDiscount")
    private BigDecimal maxDiscount;

    private static final long serialVersionUID = 1L;
}