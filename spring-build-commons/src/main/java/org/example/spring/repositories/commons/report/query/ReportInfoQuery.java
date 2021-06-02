package org.example.spring.repositories.commons.report.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

/**
 * t_report_info
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-report-table-po-TReportInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ReportInfoQuery extends BaseQuery {
    /**
     * 报告编号
     */
    @ApiModelProperty(value = "报告编号")
    private String code;

    /**
     * 体检ID
     */
    @ApiModelProperty(value = "体检ID")
    private Long patientId;

    /**
     * 体检号
     */
    @ApiModelProperty(value = "体检号")
    private String patientCode;

    /**
     * 人员姓名
     */
    @ApiModelProperty(value = "人员姓名")
    private String name;
}