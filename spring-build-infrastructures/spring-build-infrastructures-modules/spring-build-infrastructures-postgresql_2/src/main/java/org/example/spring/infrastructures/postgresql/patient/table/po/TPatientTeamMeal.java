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

@ApiModel(value = "org-example-spring-infrastructures-postgresql-patient-table-po-TPatientTeamMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamMeal extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 体检者ID
     */
    @ApiModelProperty(value = "体检者ID")
    private Long patientId;

    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;

    /**
     * teamCode
     */
    @ApiModelProperty(value = "teamCode")
    private String teamCode;

    /**
     * teamName
     */
    @ApiModelProperty(value = "teamName")
    private String teamName;

    /**
     * mealType
     */
    @ApiModelProperty(value = "mealType")
    private String mealType;

    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    private Long mealId;

    /**
     * mealCode
     */
    @ApiModelProperty(value = "mealCode")
    private String mealCode;

    /**
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    private String mealName;

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
}