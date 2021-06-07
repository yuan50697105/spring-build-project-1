package org.example.spring.repositories.commons.entity.customer.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.ICommonsQuery;

/**
 * t_seller_info
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-customer-table-po-TSellerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class SellerInfoQuery extends ICommonsQuery {
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
    private Integer ageStart;
    @ApiModelProperty(value = "age")
    private Integer ageEnd;

    /**
     * address
     */
    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    private String phone;
    /**
     * status
     */
    @ApiModelProperty(value = "status")
    private String status;
}