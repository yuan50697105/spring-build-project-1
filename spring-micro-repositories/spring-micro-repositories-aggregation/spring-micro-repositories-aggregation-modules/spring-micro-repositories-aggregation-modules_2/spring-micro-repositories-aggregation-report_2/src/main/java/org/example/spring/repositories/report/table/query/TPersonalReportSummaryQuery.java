package org.example.spring.repositories.report.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.report.table.po.TPersonalReportSummary;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPersonalReportSummaryQuery extends TkBaseQuery<TPersonalReportSummary> implements MybatisExampleForTk<TPersonalReportSummary, Example> {
    @AndEqualTo
    private Long patientId;
}