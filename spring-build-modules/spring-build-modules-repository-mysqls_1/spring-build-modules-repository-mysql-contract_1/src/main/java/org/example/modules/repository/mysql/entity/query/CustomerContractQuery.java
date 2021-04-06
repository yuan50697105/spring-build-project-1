package org.example.modules.repository.mysql.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerContractQuery extends BaseQuery {
    private static final long serialVersionUID = 1L;
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

}