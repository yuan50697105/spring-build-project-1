package org.example.spring.daos.clickhouse.customer.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.clickhouse.customer.table.po.TCustomerInfo;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_customer_info
 */
@ApiModel(value = "org-example-spring-daos-mysql-customer-table-po-TCustomerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerInfoQuery extends TkBaseQuery<TCustomerInfo> implements Serializable, MybatisExampleForTk<TCustomerInfo, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    @AndLike
    private String code;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    @AndLike
    private String name;
    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    @AndEqualTo
    private String type;
}