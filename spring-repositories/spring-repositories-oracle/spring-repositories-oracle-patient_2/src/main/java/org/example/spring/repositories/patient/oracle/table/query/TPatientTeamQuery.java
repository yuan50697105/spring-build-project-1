package org.example.spring.repositories.patient.oracle.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeam;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient_group
 */
@ApiModel(value = "org-example-spring-infrastructures-oracle-patient-table-po-TPatientGroup")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamQuery extends TkBaseQuery<TPatientTeam> implements Serializable, MybatisExampleForTk<TPatientTeam, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    private Long customerId;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
    /**
     * ageStart
     */
    @ApiModelProperty(value = "ageStart")
    @AndGreaterThanOrEqualTo(property = "ageStart")
    private Integer ageStart;
    /**
     * ageEnd
     */
    @ApiModelProperty(value = "ageEnd")
    @AndLessThanOrEqualTo(property = "ageEnd")
    private Integer ageEnd;
    /**
     * sex
     */
    @ApiModelProperty(value = "sex")
    @AndEqualTo
    private String sex;
    /**
     * marriage
     */
    @ApiModelProperty(value = "marriage")
    @AndEqualTo
    private String marriage;
    /**
     * bear
     */
    @ApiModelProperty(value = "bear")
    @AndEqualTo
    private String bear;
}