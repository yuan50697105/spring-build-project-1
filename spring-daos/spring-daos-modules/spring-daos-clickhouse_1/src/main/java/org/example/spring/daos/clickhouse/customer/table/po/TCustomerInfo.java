package org.example.spring.daos.clickhouse.customer.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_customer_info
 */
@ApiModel(value = "org-example-spring-daos-mysql-customer-table-po-TCustomerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerInfo extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String code;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;
    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;
}