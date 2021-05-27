package org.example.spring.daos.mssql.auth.table.query;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.daos.mssql.auth.table.po.TDepartment;
import org.example.spring.plugins.mybatis.entity.query.TkExtQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_department
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TDepartmentQuery extends TkExtQuery<TDepartment> implements Serializable, MybatisExampleForTk<TDepartment, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @AndLike
    private String name;

    /**
     * code
     */
    @AndLike
    private String code;


    @Override
    public Wrapper<TDepartment> wrapper() {
        return Wrappers.emptyWrapper();
    }
}