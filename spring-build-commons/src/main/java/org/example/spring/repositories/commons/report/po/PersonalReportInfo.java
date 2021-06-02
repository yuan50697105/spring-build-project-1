package org.example.spring.repositories.commons.report.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;

/**
 * t_personal_report_info
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-report-table-po-TPersonalReportInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PersonalReportInfo extends ICommonsEntity implements Serializable {
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    private Long patientId;

    /**
     * patientName
     */
    @ApiModelProperty(value = "patientName")
    private String patientName;

    /**
     * patientIdNumber
     */
    @ApiModelProperty(value = "patientIdNumber")
    private String patientIdNumber;

    /**
     * patientPhone
     */
    @ApiModelProperty(value = "patientPhone")
    private String patientPhone;

    /**
     * fileName
     */
    @ApiModelProperty(value = "fileName")
    private String fileName;

    /**
     * bucketName
     */
    @ApiModelProperty(value = "bucketName")
    private String bucketName;

    /**
     * templateId
     */
    @ApiModelProperty(value = "templateId")
    private Long templateId;
}