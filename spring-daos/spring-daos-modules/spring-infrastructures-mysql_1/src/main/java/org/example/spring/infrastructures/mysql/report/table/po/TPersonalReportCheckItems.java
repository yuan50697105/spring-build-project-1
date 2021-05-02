package org.example.spring.infrastructures.mysql.report.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_personal_report_check_items
 */
@ApiModel(value = "org-example-spring-daos-mysql-report-table-po-TPersonalReportCheckItems")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPersonalReportCheckItems extends IBaseEntity implements Serializable {
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    private Long patientId;

    /**
     * feeItemId
     */
    @ApiModelProperty(value = "feeItemId")
    private Long feeItemId;

    /**
     * checkItemId
     */
    @ApiModelProperty(value = "checkItemId")
    private Long checkItemId;

    /**
     * checkItemName
     */
    @ApiModelProperty(value = "checkItemName")
    private String checkItemName;

    /**
     * resultType
     */
    @ApiModelProperty(value = "resultType")
    private String resultType;

    /**
     * lowerLimit
     */
    @ApiModelProperty(value = "lowerLimit")
    private String lowerLimit;

    /**
     * upperLimit
     */
    @ApiModelProperty(value = "upperLimit")
    private String upperLimit;

    /**
     * detectionValue
     */
    @ApiModelProperty(value = "detectionValue")
    private String detectionValue;

    /**
     * conclusion
     */
    @ApiModelProperty(value = "conclusion")
    private String conclusion;
}