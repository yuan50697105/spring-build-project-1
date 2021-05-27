package org.example.spring.daos.mssql.auth.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mssql.auth.table.po.TResource;
import org.example.spring.daos.mysql.table.enumerate.TResourceType;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_resource
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TResourceQuery extends TkExtQuery<TResource> implements Serializable, MybatisExampleForTk<TResource, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @AndLike
    private String name;

    /**
     * type
     */
    @AndEqualTo
    private String type;


    @Override
    public Wrapper<TResource> wrapper() {
        return Wrappers.emptyWrapper();
    }

    public String getType() {
        return TResourceType.getValue(type);
    }

    public void setType(String type) {
        this.type = TResourceType.getValue(type);
    }
}