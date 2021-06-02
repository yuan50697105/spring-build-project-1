package org.example.spring.repositories.commons.customer.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

/**
 * t_potential_customers
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PotentialCustomersQuery extends BaseQuery {
    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * phone
     */
    private String phone;

    /**
     * level
     */
    private String level;
}