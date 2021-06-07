package org.example.spring.repositories.commons.entity.report.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;

/**
 * t_personal_report_fee_items
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-report-table-po-TPersonalReportFeeItems")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PersonalReportFeeItems extends ICommonsEntity implements Serializable {
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
     * feeItemName
     */
    @ApiModelProperty(value = "feeItemName")
    private String feeItemName;

    /**
     * conclusion
     */
    @ApiModelProperty(value = "conclusion")
    private String conclusion;
}