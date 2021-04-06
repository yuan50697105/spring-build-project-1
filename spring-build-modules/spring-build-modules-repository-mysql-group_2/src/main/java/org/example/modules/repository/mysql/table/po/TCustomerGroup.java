package org.example.modules.repository.mysql.table.po;

import java.io.Serializable;

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

    private static final long serialVersionUID = 1L;
}