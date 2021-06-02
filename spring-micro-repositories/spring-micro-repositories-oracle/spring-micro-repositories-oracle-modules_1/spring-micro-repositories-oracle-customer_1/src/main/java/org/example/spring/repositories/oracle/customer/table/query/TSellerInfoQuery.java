package org.example.spring.repositories.oracle.customer.table.query;

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
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.oracle.customer.table.po.TSellerInfo;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_seller_info
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-customer-table-po-TSellerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TSellerInfoQuery extends TkBaseQuery<TSellerInfo> implements Serializable, MybatisExampleForTk<TSellerInfo, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
    /**
     * age
     */
    @ApiModelProperty(value = "age")
    @AndGreaterThanOrEqualTo(property = "age")
    private Integer ageStart;
    @ApiModelProperty(value = "age")
    @AndLessThanOrEqualTo(property = "age")
    private Integer ageEnd;

    /**
     * address
     */
    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    @AndLike
    private String phone;
    /**
     * status
     */
    @ApiModelProperty(value = "status")
    @AndEqualTo
    private String status;
}