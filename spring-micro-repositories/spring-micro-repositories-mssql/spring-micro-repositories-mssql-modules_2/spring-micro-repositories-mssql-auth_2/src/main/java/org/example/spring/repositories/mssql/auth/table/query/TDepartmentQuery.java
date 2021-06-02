package org.example.spring.repositories.mssql.auth.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.mssql.auth.table.po.TDepartment;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_department
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-org.example.spring.repositories.mssql.auth-table-po-TDepartment")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TDepartmentQuery extends TkBaseQuery<TDepartment> implements Serializable, MybatisExampleForTk<TDepartment, Example> {
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
}