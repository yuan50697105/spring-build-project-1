package org.example.spring.infrastructures.es.patient.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_patient_group
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-patient-table-po-TPatientGroup")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeamQuery extends IBaseQuery {
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    private Long customerId;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * ageStart
     */
    @ApiModelProperty(value = "ageStart")
    private Integer ageStart;

    /**
     * ageEnd
     */
    @ApiModelProperty(value = "ageEnd")
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

    private static final long serialVersionUID = 1L;
}