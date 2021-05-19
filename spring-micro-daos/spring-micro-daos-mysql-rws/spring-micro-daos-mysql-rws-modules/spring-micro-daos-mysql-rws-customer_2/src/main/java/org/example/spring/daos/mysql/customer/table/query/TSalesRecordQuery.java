package org.example.spring.daos.mysql.customer.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.customer.table.po.TSalesRecord;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 销售记录
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TSalesRecordQuery extends TkBaseQuery<TSalesRecord> implements Serializable, MybatisExampleForTk<TSalesRecord, Example> {
    /**
     * 销售员Id
     */
    @AndEqualTo
    private Long sellerId;

    /**
     * 销售员编号
     */
    @AndLike
    private String sellerCode;


    /**
     * 客户ID
     */
    @AndEqualTo
    private Long customerId;

    /**
     * 客户编号
     */
    @AndLike
    private String customerCode;

    /**
     * 客户姓名
     */
    @AndLike
    private String customerName;

    /**
     * 金额
     */
    @AndGreaterThanOrEqualTo(property = "amount")
    private BigDecimal amountStart;
    @AndLessThanOrEqualTo(property = "amount")
    private BigDecimal amountEnd;
}