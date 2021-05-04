package org.example.spring.daos.mysql.customer.table.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;

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