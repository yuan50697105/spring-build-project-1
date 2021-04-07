package org.example.spring.infrastructures.mysql.customer.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.infrastructures.mysql.customer.table.enumerate.CustomerType;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerQuery extends BaseQuery {
    private String code;
    private String name;
    private CustomerType type;
}