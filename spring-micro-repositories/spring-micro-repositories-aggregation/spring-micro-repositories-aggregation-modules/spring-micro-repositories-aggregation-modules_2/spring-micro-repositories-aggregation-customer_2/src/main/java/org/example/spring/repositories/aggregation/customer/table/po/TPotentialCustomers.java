package org.example.spring.repositories.aggregation.customer.table.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_potential_customers
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TPotentialCustomers extends IBaseEntity implements Serializable {
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