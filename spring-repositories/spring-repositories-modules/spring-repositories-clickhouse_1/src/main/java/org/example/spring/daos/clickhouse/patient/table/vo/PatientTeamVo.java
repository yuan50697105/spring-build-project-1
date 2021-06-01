package org.example.spring.repositories.clickhouse.patient.table.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.repositories.clickhouse.patient.table.po.TPatientTeam;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientTeamVo extends TPatientTeam implements Serializable {

    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    @NotEmpty
    private Long customerId;

    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @NotBlank
    private String code;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @NotBlank
    private String name;
}