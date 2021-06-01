package org.example.spring.repositories.mysql.patient.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.mysql.patient.table.po.TPatientTeamMealFeeItem;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_team_meal_fee_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientTeamMealFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamMealFeeItemQuery extends TkBaseQuery<TPatientTeamMealFeeItem> implements Serializable, MybatisExampleForTk<TPatientTeamMealFeeItem, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    @AndEqualTo
    private Long teamId;
    @ApiModelProperty(value = "teamMealId")
    @AndEqualTo
    private Long teamMealId;
    /**
     * patientId
     */
    @ApiModelProperty(value = "mealId")
    @AndEqualTo
    private Long mealId;
    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    @AndEqualTo
    private Long feeItemId;
    /**
     * feeItemCode
     */
    @ApiModelProperty(value = "feeItemCode")
    @AndLike
    private String feeItemCode;
    /**
     * feeItemName
     */
    @ApiModelProperty(value = "feeItemName")
    @AndLike
    private String feeItemName;
    /**
     * source
     */
    @ApiModelProperty(value = "source")
    @AndEqualTo
    private String source;
    /**
     * type
     */
    @ApiModelProperty(value = "type")
    @AndEqualTo
    private String type;
}