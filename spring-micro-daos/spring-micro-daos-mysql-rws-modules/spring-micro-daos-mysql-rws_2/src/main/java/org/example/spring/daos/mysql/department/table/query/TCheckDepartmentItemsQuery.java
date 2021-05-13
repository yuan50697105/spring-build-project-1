package org.example.spring.daos.mysql.department.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mysql.department.table.po.TCheckDepartmentItems;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_check_department_items
 */
@ApiModel(value = "org-example-spring-daos-mysql-department-table-po-TCheckDepartmentItems")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCheckDepartmentItemsQuery extends TkBaseQuery<TCheckDepartmentItems> implements Serializable, MybatisExampleForTk<TCheckDepartmentItems, Example> {
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
     * checkItemId
     */
    @ApiModelProperty(value = "checkItemId")
    private String checkItemId;
}