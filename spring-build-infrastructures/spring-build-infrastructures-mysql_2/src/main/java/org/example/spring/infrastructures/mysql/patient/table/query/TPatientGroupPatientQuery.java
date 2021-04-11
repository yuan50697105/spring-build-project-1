package org.example.spring.infrastructures.mysql.patient.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupPatient;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_group_patient
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientGroupPatient")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientGroupPatientQuery extends TkBaseQuery<TPatientGroupPatient> implements Serializable, MybatisExampleForTk<TPatientGroupPatient, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    @AndEqualTo
    private Long groupId;
    /**
     * groupItemId
     */
    @ApiModelProperty(value = "groupItemId")
    @AndEqualTo
    private Long groupItemId;
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    @AndEqualTo
    private Long patientId;
}