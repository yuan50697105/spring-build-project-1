package org.example.spring.daos.postgresql.customer.table.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

@ApiModel(value = "org-example-spring-daos-postgresql-customer-table-po-TSellerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TSellerInfo extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * age
     */
    @ApiModelProperty(value = "age")
    private Integer age;

    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    private String phone;

    /**
     * address
     */
    @ApiModelProperty(value = "address")
    private String address;

    /**
     * status
     */
    @ApiModelProperty(value = "status")
    private String status;
}