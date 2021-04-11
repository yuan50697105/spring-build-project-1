package org.example.spring.infrastructures.mysql.customer.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_customer_commons
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-customer-table-po-TCustomerCommons")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerCommonsQuery extends TkBaseQuery<TCustomerCommons> implements Serializable, MybatisExampleForTk<TCustomerCommons, Example> {
    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    @AndEqualTo
    private Long customerId;

    /**
     * 销售员ID
     */
    @ApiModelProperty(value = "销售员ID")
    @AndEqualTo
    private Long sellerId;

    /**
     * status
     */
    @ApiModelProperty(value = "status")
    @AndEqualTo
    private String status;

    private static final long serialVersionUID = 1L;
}