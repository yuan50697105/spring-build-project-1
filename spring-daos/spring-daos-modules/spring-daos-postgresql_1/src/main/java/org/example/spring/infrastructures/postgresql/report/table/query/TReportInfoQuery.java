package org.example.spring.infrastructures.postgresql.report.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.postgresql.report.table.po.TReportInfo;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_report_info
 */
@ApiModel(value = "org-example-spring-daos-postgresql-report-table-po-TReportInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TReportInfoQuery extends TkBaseQuery<TReportInfo> implements Serializable, MybatisExampleForTk<TReportInfo, Example> {
    /**
     * 报告编号
     */
    @ApiModelProperty(value = "报告编号")
    @AndLike
    private String code;

    /**
     * 体检ID
     */
    @ApiModelProperty(value = "体检ID")
    @AndEqualTo
    private Long patientId;

    /**
     * 体检号
     */
    @ApiModelProperty(value = "体检号")
    @AndLike
    private String patientCode;

    /**
     * 人员姓名
     */
    @ApiModelProperty(value = "人员姓名")
    @AndLike
    private String name;
}