package org.example.spring.infrastructures.mysql.patient.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMeal;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_team_meal
 */
@ApiModel(value = "org-example-spring-daos-mysql-patient-table-po-TPatientTeamMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamMealQuery extends TkBaseQuery<TPatientTeamMeal> implements Serializable, MybatisExampleForTk<TPatientTeamMeal, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    @AndEqualTo
    private Long teamId;
    /**
     * teamCode
     */
    @ApiModelProperty(value = "teamCode")
    @AndLike
    private String teamCode;
    /**
     * teamName
     */
    @ApiModelProperty(value = "teamName")
    @AndLike
    private String teamName;
    /**
     * mealType
     */
    @ApiModelProperty(value = "mealType")
    @AndEqualTo
    private String mealType;
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    @AndEqualTo
    private Long mealId;
    /**
     * mealCode
     */
    @ApiModelProperty(value = "mealCode")
    @AndLike
    private String mealCode;
    /**
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    @AndLike
    private String mealName;
}