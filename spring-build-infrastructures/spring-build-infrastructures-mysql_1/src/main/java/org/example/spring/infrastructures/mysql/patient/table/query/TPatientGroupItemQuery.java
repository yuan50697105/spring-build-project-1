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
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupItem;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_patient_group_item
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientGroupItem")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientGroupItemQuery extends TkBaseQuery<TPatientGroupItem> implements Serializable, MybatisExampleForTk<TPatientGroupItem, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    @AndEqualTo
    private Long customerId;
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    @AndEqualTo
    private Long groupId;
    /**
     * mealId
     */
    @ApiModelProperty(value = "mealId")
    @AndEqualTo
    private Long mealId;
    /**
     * mealName
     */
    @ApiModelProperty(value = "mealName")
    @AndLike
    private String mealName;
}