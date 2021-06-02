package org.example.spring.repositories.oracle.bill.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import org.example.spring.repositories.commons.enumerate.BillSubInfoStatus;
import org.example.spring.repositories.oracle.bill.table.po.TBillSubInfo;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillSubInfoQuery extends TkExtQuery<TBillSubInfo> implements MybatisExampleForTk<TBillSubInfo, Example> {
    /**
     * 子单单号
     */
    @AndLike
    private String subOrderNo;
    /**
     * 总单ID
     */
    @AndEqualTo
    private String billId;
    /**
     * 总单单号
     */
    @AndLike
    private String orderNo;
    /**
     * 状态
     *
     * @see BillSubInfoStatus
     */
    @AndEqualTo
    private String status;

    @Override
    public Wrapper<TBillSubInfo> wrapper() {
        return null;
    }

    public String getStatus() {
        return BillSubInfoStatus.getValue(status);
    }

    public void setStatus(String status) {
        this.status = BillSubInfoStatus.getValue(status);
    }
}