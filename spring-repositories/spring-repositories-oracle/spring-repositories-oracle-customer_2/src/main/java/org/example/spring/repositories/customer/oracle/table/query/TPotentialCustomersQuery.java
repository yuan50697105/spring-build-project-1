package org.example.spring.repositories.customer.oracle.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.query.TkBaseQuery;
import org.example.spring.repositories.customer.oracle.table.po.TPotentialCustomers;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_potential_customers
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPotentialCustomersQuery extends TkBaseQuery<TPotentialCustomers> implements Serializable, MybatisExampleForTk<TPotentialCustomers, Example> {
    /**
     * code
     */
    @AndLike
    private String code;

    /**
     * name
     */
    @AndLike
    private String name;

    /**
     * phone
     */
    @AndLike
    private String phone;

    /**
     * level
     */
    @AndEqualTo
    private String level;
}