package org.example.spring.daos.postgres.patient.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.postgres.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_team_meal_check_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientTeamMealCheckItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamMealCheckItemQuery extends TkBaseQuery<TPatientTeamMealCheckItem> implements Serializable, MybatisExampleForTk<TPatientTeamMealCheckItem, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * patientId
     */
    @ApiModelProperty(value = "teamId")
    @AndEqualTo
    private Long teamId;
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    @AndEqualTo
    private Long mealId;

    /**
     * teamMealId
     */
    @ApiModelProperty(value = "teamMealId")
    @AndEqualTo
    private Long teamMealId;
    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    @AndEqualTo
    private Long feeItemId;

    /**
     * teamFeeItemId
     */
    @ApiModelProperty(value = "teamFeeItemId")
    @AndEqualTo
    private Long teamFeeItemId;
    /**
     * checkItemId
     */
    @ApiModelProperty(value = "checkItemId")
    @AndEqualTo
    private String checkItemId;
    /**
     * checkItemCode
     */
    @ApiModelProperty(value = "checkItemCode")
    @AndLike
    private String checkItemCode;
    /**
     * checkItemName
     */
    @ApiModelProperty(value = "checkItemName")
    @AndLike
    private String checkItemName;
    /**
     * source
     */
    @ApiModelProperty(value = "source")
    @AndEqualTo
    private String source;
}