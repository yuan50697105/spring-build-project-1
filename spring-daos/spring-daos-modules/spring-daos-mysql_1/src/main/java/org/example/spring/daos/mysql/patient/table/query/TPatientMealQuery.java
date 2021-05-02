package org.example.spring.daos.mysql.patient.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.patient.table.po.TPatientMeal;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_meal
 */
@ApiModel(value = "org-example-spring-daos-mysql-patient-table-po-TPatientMeal")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientMealQuery extends TkBaseQuery<TPatientMeal> implements Serializable, MybatisExampleForTk<TPatientMeal, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * teamId
     */
    @ApiModelProperty(value = "teamId")
    @AndEqualTo
    private Long teamId;
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    @AndEqualTo
    private Long groupId;
    /**
     * mealType
     */
    @ApiModelProperty(value = "mealType")
    @AndEqualTo
    private String mealType;
    /**
     * mealSource
     */
    @ApiModelProperty(value = "mealSource")
    @AndEqualTo
    private String mealSource;
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