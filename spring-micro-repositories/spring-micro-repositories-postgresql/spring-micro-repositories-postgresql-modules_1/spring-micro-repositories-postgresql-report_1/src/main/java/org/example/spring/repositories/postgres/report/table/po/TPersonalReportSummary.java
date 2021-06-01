package org.example.spring.repositories.postgres.report.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_personal_report_summary
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-report-table-po-TPersonalReportSummary")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPersonalReportSummary extends IBaseEntity implements Serializable {
    /**
     * patientId
     */
    @ApiModelProperty(value = "patientId")
    private Long patientId;

    /**
     * conclusion
     */
    @ApiModelProperty(value = "conclusion")
    private String conclusion;
}