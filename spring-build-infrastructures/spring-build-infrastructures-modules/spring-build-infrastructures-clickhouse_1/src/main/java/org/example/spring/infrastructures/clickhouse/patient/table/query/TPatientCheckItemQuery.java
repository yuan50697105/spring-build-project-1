package org.example.spring.infrastructures.clickhouse.patient.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.clickhouse.patient.table.po.TPatientCheckItem;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_check_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientCheckItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientCheckItemQuery extends TkBaseQuery<TPatientCheckItem> implements Serializable, MybatisExampleForTk<TPatientCheckItem, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    @AndEqualTo
    private Long patientId;
    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    @AndEqualTo
    private Long feeItemId;
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
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    @AndEqualTo
    private Long mealId;
    /**
     * source
     */
    @ApiModelProperty(value = "source")
    @AndEqualTo
    private String source;
}