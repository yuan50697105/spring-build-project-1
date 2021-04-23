package org.example.spring.infrastructures.postgresql.patient.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

@ApiModel(value = "org-example-spring-infrastructures-postgresql-patient-table-po-TPatientTeam")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPatientTeam extends IBaseEntity implements Serializable {
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
}