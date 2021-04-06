package org.example.modules.repository.mysql.table.query;

import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.modules.repository.mysql.table.po.TCustomerContract;
import org.example.plugins.mybatis.entity.query.TkBaseQuery;

import java.io.Serializable;

/**
 * t_customer_contract
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerContractQuery extends TkBaseQuery<TCustomerContract> implements Serializable {
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
     * contractName
     */
    @AndLike
    private String contractName;
}