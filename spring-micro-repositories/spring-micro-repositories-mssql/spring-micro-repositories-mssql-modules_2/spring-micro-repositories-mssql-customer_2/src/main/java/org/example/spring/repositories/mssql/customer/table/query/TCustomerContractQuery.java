package org.example.spring.repositories.mssql.customer.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.repositories.mssql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mysql.table.enumerate.TCustomerContractStatus;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.Date;

/**
 * t_customer_contract
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-customer-table-po-TCustomerContract")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerContractQuery extends TkBaseQuery<TCustomerContract> implements Serializable, MybatisExampleForTk<TCustomerContract, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * 合同编号
     */
    @ApiModelProperty(value = "合同编号")
    @AndLike
    private String code;
    /**
     * 客户名称
     */
    @ApiModelProperty(value = "客户名称")
    @AndLike
    private String name;
    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    @AndEqualTo
    private Long customerId;
    /**
     * 签约时间
     */
    @ApiModelProperty(value = "签约时间")
    @AndGreaterThanOrEqualTo(property = "signingTime")
    private Date signingTimeStart;
    @ApiModelProperty(value = "签约时间")
    @AndLessThanOrEqualTo(property = "signingTime")
    private Date signingTimeEnd;
    /**
     * 合同状态
     */
    @ApiModelProperty(value = "合同状态")
    @AndEqualTo
    private String status;

    public String getStatus() {
        return TCustomerContractStatus.getValue(status);
    }

    public void setStatus(String status) {
        this.status = TCustomerContractStatus.getValue(status);
    }
}