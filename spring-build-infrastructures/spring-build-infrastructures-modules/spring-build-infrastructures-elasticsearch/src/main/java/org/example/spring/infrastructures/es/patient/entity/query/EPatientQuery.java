package org.example.spring.infrastructures.es.patient.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_patient
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatient")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EPatientQuery extends IBaseQuery {
    private static final long serialVersionUID = 1L;
    /**
     * groupId
     */
    @ApiModelProperty(value = "groupId")
    private Long groupId;
    /**
     * groupCode
     */
    @ApiModelProperty(value = "groupCode")
    private String groupCode;
    /**
     * groupName
     */
    @ApiModelProperty(value = "groupName")
    private String groupName;

    /**
     * groupItemId
     */
    @ApiModelProperty(value = "teamId")
    private Long teamId;
    @ApiModelProperty(value = "teamCode")
    private String teamCode;
    @ApiModelProperty(value = "teamName")
    private String teamName;
    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    private Long customerId;
    /**
     * customerType
     */
    @ApiModelProperty(value = "customerType")
    private String customerType;
    /**
     * customerName
     */
    @ApiModelProperty(value = "customerName")
    private String customerName;
    /**
     * age
     */
    @ApiModelProperty(value = "age")
    private Integer ageStart;
    private Integer ageEnd;
    /**
     * sex
     */
    @ApiModelProperty(value = "sex")
    private String sex;
    /**
     * marriage
     */
    @ApiModelProperty(value = "marriage")
    private String marriage;
    /**
     * bear
     */
    @ApiModelProperty(value = "bear")
    private String bear;
    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    private String phone;
}