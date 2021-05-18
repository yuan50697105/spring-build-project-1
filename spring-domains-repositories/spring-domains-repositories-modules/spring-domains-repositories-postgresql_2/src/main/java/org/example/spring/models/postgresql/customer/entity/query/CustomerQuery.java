package org.example.spring.models.postgresql.customer.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.table.enumerate.TCustomerType;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerQuery extends BaseQuery {
    private String code;
    private String name;
    private String type;

    public String getType() {
        return TCustomerType.getValue(type);
    }

    public void setType(String type) {
        this.type = TCustomerType.getValue(type);
    }
}