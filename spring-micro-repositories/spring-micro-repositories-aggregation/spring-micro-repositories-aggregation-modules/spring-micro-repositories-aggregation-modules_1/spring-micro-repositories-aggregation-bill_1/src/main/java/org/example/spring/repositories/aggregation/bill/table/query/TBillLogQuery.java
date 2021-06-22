package org.example.spring.repositories.aggregation.bill.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import org.example.spring.repositories.commons.enumerate.BillLogType;
import org.example.spring.repositories.aggregation.bill.table.po.TBillLog;
import tk.mybatis.mapper.entity.Example;

/**
 * 总单日志
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TBillLogQuery extends TkExtQuery<TBillLog> implements MybatisExampleForTk<TBillLog, Example> {
    /**
     * 订单号
     */
    @AndLike
    private String orderNo;
    /**
     * 体检号
     */
    @AndLike
    private String patientCode;
    @AndEqualTo
    private String patientId;
    /**
     * 类型
     *
     * @see BillLogType
     */
    @AndEqualTo
    private String type;

    @Override
    public Wrapper<TBillLog> wrapper() {
        return null;
    }

    public String getType() {
        return BillLogType.getValue(type);
    }

    public void setType(String type) {
        this.type = BillLogType.getValue(type);
    }
}