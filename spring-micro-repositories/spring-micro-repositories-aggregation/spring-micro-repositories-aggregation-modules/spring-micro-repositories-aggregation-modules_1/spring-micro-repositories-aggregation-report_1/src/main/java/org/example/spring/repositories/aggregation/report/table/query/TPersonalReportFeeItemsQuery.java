package org.example.spring.repositories.aggregation.report.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.aggregation.report.table.po.TPersonalReportFeeItems;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPersonalReportFeeItemsQuery extends TkBaseQuery<TPersonalReportFeeItems> implements MybatisExampleForTk<TPersonalReportFeeItems, Example> {
    @AndEqualTo
    private Long patientId;
    @AndEqualTo
    private Long feeItemId;
    @AndLike
    private String feeItemName;

}