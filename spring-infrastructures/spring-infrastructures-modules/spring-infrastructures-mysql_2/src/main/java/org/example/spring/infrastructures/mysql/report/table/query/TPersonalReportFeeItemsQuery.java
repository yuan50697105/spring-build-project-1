package org.example.spring.infrastructures.mysql.report.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPersonalReportFeeItems extends TkBaseQuery<TPersonalReportFeeItems> implements MybatisExampleForTk<TPersonalReportFeeItems, Example> {
    @AndEqualTo
    private Long patientId;
    @AndEqualTo
    private Long feeItemId;
    @AndLike
    private String feeItemName;

}