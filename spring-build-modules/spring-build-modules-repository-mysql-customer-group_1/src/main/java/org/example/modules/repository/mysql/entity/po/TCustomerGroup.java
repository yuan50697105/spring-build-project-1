package org.example.modules.repository.mysql.entity.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
    * t_customer_group
    */
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerGroup extends IBaseEntity implements Serializable {
    /**
    * code
    */
    private String code;

    /**
    * name
    */
    private String name;

    /**
    * type
    */
    private String type;

    /**
    * phone
    */
    private String phone;

    /**
    * principal
    */
    private String principal;

    /**
    * principalPhone
    */
    private String principalPhone;

    private static final long serialVersionUID = 1L;
}