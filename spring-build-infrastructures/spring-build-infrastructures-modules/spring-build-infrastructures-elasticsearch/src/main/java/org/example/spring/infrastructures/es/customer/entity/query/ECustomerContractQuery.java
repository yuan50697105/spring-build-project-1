package org.example.spring.infrastructures.es.customer.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

import java.util.Date;

/**
 * t_customer_contract
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-customer-table-po-TCustomerContract")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ECustomerContractQuery extends IBaseQuery {
    private static final long serialVersionUID = 1L;
    /**
     * 合同编号
     */
    @ApiModelProperty(value = "合同编号")
    private String code;
    /**
     * 客户名称
     */
    @ApiModelProperty(value = "客户名称")
    private String name;
    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    private Long customerId;
    /**
     * 签约时间
     */
    @ApiModelProperty(value = "签约时间")
    private Date signingTimeStart;
    @ApiModelProperty(value = "签约时间")
    private Date signingTimeEnd;
    /**
     * 合同状态
     */
    @ApiModelProperty(value = "合同状态")
    private String status;
}