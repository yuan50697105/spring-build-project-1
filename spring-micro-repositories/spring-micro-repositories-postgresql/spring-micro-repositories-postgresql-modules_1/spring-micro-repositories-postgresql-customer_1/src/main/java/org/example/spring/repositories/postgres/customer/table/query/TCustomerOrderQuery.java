package org.example.spring.repositories.postgres.customer.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.repositories.postgres.customer.table.po.TCustomerOrder;
import org.example.spring.daos.mysql.table.enumerate.TCustomerOrderStatus;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_customer_order
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerOrderQuery extends TkBaseQuery<TCustomerOrder> implements Serializable, MybatisExampleForTk<TCustomerOrder, Example> {
    /**
     * orderNo
     */
    @AndLike
    private String orderNo;

    /**
     * customerId
     */
    @AndEqualTo
    private String customerId;

    /**
     * customerCode
     */
    @AndLike
    private String customerCode;

    /**
     * customerName
     */
    @AndLike
    private String customerName;

    /**
     * totalAmount
     */
    @AndGreaterThanOrEqualTo(property = "totalAmount")
    private BigDecimal totalAmountStart;
    @AndLessThanOrEqualTo(property = "totalAmount")
    private BigDecimal totalAmountEnd;

    /**
     * status
     */
    @AndEqualTo
    private String status;

    public String getStatus() {
        return TCustomerOrderStatus.getValue(status);
    }

    public void setStatus(String status) {
        this.status = TCustomerOrderStatus.getValue(status);
    }
}