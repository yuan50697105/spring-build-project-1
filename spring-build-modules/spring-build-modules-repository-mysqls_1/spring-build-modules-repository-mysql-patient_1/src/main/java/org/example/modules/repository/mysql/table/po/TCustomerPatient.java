package org.example.modules.repository.mysql.table.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_customer_patient
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerPatient extends IBaseEntity implements Serializable {
    /**
     * customerId
     */
    private String customerId;

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
     * idCardNo
     */
    private String idCardNo;

    private static final long serialVersionUID = 1L;
}