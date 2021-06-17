package org.example.spring.repositories.postgres.patient.table.query;

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
import org.example.spring.repositories.postgres.patient.table.po.TPatient;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_patient
 */
@ApiModel(value = "org-example-spring-infrastructures-postgres-patient-table-po-TPatient")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientQuery extends TkBaseQuery<TPatient> implements Serializable, MybatisExampleForTk<TPatient, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    @AndEqualTo
    private Long groupId;
    /**
     * groupCode
     */
    @ApiModelProperty(value = "groupCode")
    @AndLike
    private String groupCode;
    /**
     * groupName
     */
    @ApiModelProperty(value = "groupName")
    @AndLike
    private String groupName;

    /**
     * groupItemId
     */
    @ApiModelProperty(value = "teamId")
    @AndEqualTo
    private Long teamId;
    @ApiModelProperty(value = "teamCode")
    @AndLike
    private String teamCode;
    @ApiModelProperty(value = "teamName")
    @AndLike
    private String teamName;
    /**
     * type
     */
    @ApiModelProperty(value = "type")
    @AndEqualTo
    private String type;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    @AndEqualTo
    private Long customerId;
    /**
     * customerType
     */
    @ApiModelProperty(value = "customerType")
    @AndEqualTo
    private String customerType;
    /**
     * customerName
     */
    @ApiModelProperty(value = "customerName")
    @AndLike
    private String customerName;
    /**
     * age
     */
    @ApiModelProperty(value = "age")
    @AndGreaterThanOrEqualTo(property = "age")
    private Integer ageStart;
    @AndLessThanOrEqualTo(property = "age")
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
    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    @AndLike
    private String phone;
}