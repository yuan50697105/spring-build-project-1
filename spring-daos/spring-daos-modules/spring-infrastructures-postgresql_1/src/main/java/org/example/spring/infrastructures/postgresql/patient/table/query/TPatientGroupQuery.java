package org.example.spring.infrastructures.postgresql.patient.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.postgresql.patient.table.po.TPatientGroup;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_group_item
 */
@ApiModel(value = "org-example-spring-daos-mysql-patient-table-po-TPatientGroupItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientGroupQuery extends TkBaseQuery<TPatientGroup> implements Serializable, MybatisExampleForTk<TPatientGroup, Example> {
    private static final long serialVersionUID = 1L;
    @AndLike
    private String code;
    @AndLike
    private String name;
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    @AndEqualTo
    private Long customerId;
    /**
     * groupId
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
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    @AndLike
    private String mealName;
}