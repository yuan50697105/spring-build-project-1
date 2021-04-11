package org.example.spring.infrastructures.mysql.auth.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.table.enumerate.TResourceType;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
    * t_permission
    */
@ApiModel(value="org-example-spring-infrastructures-mysql-auth-table-po-TPermission")
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class TPermissionQuery extends TkBaseQuery<TPermission> implements Serializable, MybatisExampleForTk<TPermission, Example> {
    /**
    * name
    */
    @ApiModelProperty(value="name")
    @AndLike
    private String name;

    /**
    * type
    */
    @ApiModelProperty(value="type")
    @AndEqualTo
    private TResourceType type;
    private Long pid;

    private static final long serialVersionUID = 1L;
}