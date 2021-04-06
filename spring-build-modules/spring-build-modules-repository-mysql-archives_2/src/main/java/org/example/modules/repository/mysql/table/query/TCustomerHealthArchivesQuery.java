package org.example.modules.repository.mysql.table.query;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.table.po.TCustomerHealthArchives;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * t_customer_health_archives
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerHealthArchivesQuery extends TkBaseQuery<TCustomerHealthArchives> implements Serializable, MybatisExampleForTk<TCustomerHealthArchives, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * customerId
     */
    @AndEqualTo
    private Long customerId;
    /**
     * customerCode
     */
    @AndLike
    private String customerCode;
    /**
     * customerName
     */
    @AndLike
    private String customerName;
}