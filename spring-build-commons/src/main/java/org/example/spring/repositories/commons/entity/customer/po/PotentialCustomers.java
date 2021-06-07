package org.example.spring.repositories.commons.entity.customer.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.commons.entity.ICommonsEntity;

import java.io.Serializable;

/**
 * t_potential_customers
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PotentialCustomers extends ICommonsEntity implements Serializable {
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