package org.example.spring.daos.mysql.report.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.report.table.po.TPersonalReportCheckItems;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TPersonalReportCheckItemsQuery extends TkBaseQuery<TPersonalReportCheckItems> implements MybatisExampleForTk<TPersonalReportCheckItems, Example> {
    @AndEqualTo
    private Long patientId;
    @AndEqualTo
    private Long feeItemId;
    @AndEqualTo
    private Long checkItemId;
    @AndLike
    private String checkItemName;
    @AndEqualTo
    private String resultType;
}