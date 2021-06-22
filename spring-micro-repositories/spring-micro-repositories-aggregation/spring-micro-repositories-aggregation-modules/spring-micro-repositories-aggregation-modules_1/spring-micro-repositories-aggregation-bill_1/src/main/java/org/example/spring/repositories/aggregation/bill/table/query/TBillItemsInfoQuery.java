package org.example.spring.repositories.aggregation.bill.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import org.example.spring.repositories.aggregation.bill.table.po.TBillItemsInfo;
import tk.mybatis.mapper.entity.Example;

/**
 * 订单项目
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TBillItemsInfoQuery extends TkExtQuery<TBillItemsInfo> implements MybatisExampleForTk<TBillItemsInfo, Example> {
    @AndEqualTo
    private String billId;
    @AndLike
    private String orderNo;
    @AndLike
    private String subOrderNo;
    @AndEqualTo
    private Long itemId;
    @AndLike
    private String itemName;

    @Override
    public Wrapper<TBillItemsInfo> wrapper() {
        return Wrappers.emptyWrapper();
    }
}