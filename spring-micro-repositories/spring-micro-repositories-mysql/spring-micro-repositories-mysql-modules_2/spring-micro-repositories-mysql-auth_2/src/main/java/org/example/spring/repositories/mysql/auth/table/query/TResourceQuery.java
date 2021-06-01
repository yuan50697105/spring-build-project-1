package org.example.spring.repositories.mysql.auth.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.repositories.mysql.auth.table.po.TResource;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_permission
 */
@ApiModel(value = "org-example-spring-infrastructures-mysql-org.example.spring.repositories.mysql.auth-table-po-TPermission")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TResourceQuery extends TkBaseQuery<TResource> implements Serializable, MybatisExampleForTk<TResource, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
    /**
     * type
     */
    @ApiModelProperty(value = "type")
    @AndEqualTo
    private String type;
    private Long pid;
}