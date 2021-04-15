package org.example.spring.infrastructures.es.customer.entity.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.elasticsearch.entity.query.IBaseQuery;

/**
 * t_seller_info
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-customer-table-po-TSellerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ESellerInfoQuery extends IBaseQuery {
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
     * phone
     */
    @ApiModelProperty(value = "phone")
    private String phone;

    /**
     * address
     */
    /**
     * status
     */
    @ApiModelProperty(value = "status")
    private String status;

    private static final long serialVersionUID = 1L;
}