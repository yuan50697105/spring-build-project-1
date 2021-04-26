package org.example.spring.infrastructures.clickhouse.auth.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.clickhouse.auth.table.po.TRole;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_role
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-auth-table-po-TRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TRoleQuery extends TkBaseQuery<TRole> implements Serializable, MybatisExampleForTk<TRole, Example> {
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;

    private static final long serialVersionUID = 1L;
}