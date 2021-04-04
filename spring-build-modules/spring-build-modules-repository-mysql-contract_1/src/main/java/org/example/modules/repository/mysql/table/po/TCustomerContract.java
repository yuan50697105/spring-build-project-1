package org.example.modules.repository.mysql.table.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_customer_contract
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerContract extends IBaseEntity implements Serializable {
    /**
     * customerId
     */
    private Long customerId;

    /**
     * customerCode
     */
    private String customerCode;

    /**
     * contractName
     */
    private String contractName;

    /**
     * contractPath
     */
    private String contractPath;

    private static final long serialVersionUID = 1L;
}