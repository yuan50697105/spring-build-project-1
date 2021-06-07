package org.example.spring.repositories.commons.entity.customer.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;
import org.example.spring.repositories.commons.enumerate.CustomerInfoType;

/**
 * t_customer_info
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-customer-table-po-TCustomerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfoQuery extends ICommonsQuery {
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

    public String getType() {
        return CustomerInfoType.getValue(type);
    }

    public void setType(String type) {
        this.type = CustomerInfoType.getValue(type);
    }
}