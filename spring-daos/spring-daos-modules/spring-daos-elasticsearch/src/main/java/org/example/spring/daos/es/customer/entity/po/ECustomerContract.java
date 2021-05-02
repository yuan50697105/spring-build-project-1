package org.example.spring.daos.es.customer.entity.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.po.IBaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_customer_contract
 */
@ApiModel(value = "org-example-spring-daos-mysql-customer-table-po-TCustomerContract")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ECustomerContract extends IBaseEntity implements Serializable {
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
    private Date signingTime;
    /**
     * 合同状态
     */
    @ApiModelProperty(value = "合同状态")
    private String status;
    /**
     * fileName
     */
    @ApiModelProperty(value = "fileName")
    private String fileName;
    /**
     * bukectName
     */
    @ApiModelProperty(value = "bukectName")
    private String bukectName;
}