package org.example.spring.infrastructures.mysql.report.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPersonalReportInfo extends TkBaseQuery<TPersonalReportInfo> implements MybatisExampleForTk<TPersonalReportInfo, Example> {
    @AndEqualTo
    private Long patientId;
    @AndLike
    private String patientName;
    @AndLike
    private String patientIdNumber;
    @AndLike
    private String patientPhone;
}