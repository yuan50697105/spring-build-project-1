package org.example.spring.daos.mysql.department.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.department.table.po.TCheckDepartment;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_check_department
 */
@ApiModel(value = "org-example-spring-daos-mysql-department-table-po-TCheckDepartment")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCheckDepartmentQuery extends TkBaseQuery<TCheckDepartment> implements Serializable, MybatisExampleForTk<TCheckDepartment, Example> {
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
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;

    /**
     * location
     */
    @ApiModelProperty(value = "location")
    private String location;
}