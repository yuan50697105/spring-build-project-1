package org.example.spring.repositories.patient.mysql.table.query;

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
import org.example.spring.repositories.patient.mysql.table.po.TPatientFeeItem;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_fee_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientFeeItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientFeeItemQuery extends TkBaseQuery<TPatientFeeItem> implements Serializable, MybatisExampleForTk<TPatientFeeItem, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    @AndEqualTo
    private Long mealId;

    /**
     * patientMealId
     */
    @ApiModelProperty(value = "patientMealId")
    @AndEqualTo
    private Long patientMealId;
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
    private String feeItemId;
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