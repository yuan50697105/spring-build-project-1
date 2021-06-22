package org.example.spring.repositories.aggregation.bill.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import org.example.spring.repositories.aggregation.bill.table.po.TBillInfo;
import tk.mybatis.mapper.entity.Example;

@EqualsAndHashCode(callSuper = true)
@Data
public class TBillInfoQuery extends TkExtQuery<TBillInfo> implements MybatisExampleForTk<TBillInfo, Example> {
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
    /**
     * 体检人ID
     */
    @AndEqualTo
    private String patientId;
    /**
     * 体检人姓名
     */
    @AndLike
    private String patientName;
    /**
     * 体检人身份证号
     */
    @AndLike
    private String patientIdCardNo;

    @Override
    public Wrapper<TBillInfo> wrapper() {
        return Wrappers.emptyWrapper();
    }
}