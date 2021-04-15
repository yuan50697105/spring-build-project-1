package org.example.spring.models.customer.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.models.enumerate.CustomerType;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerQuery extends BaseQuery {
    private String code;
    private String name;
    private String type;

    public String getType() {
        return Optional.ofNullable(CustomerType.get(type)).map(CustomerType::getValue).orElse(null);
    }

    public void setType(String type) {
        this.type = Optional.ofNullable(CustomerType.get(type)).map(CustomerType::getValue).orElse(null);
    }
}