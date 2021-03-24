package org.example.modules.repository.mysql.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

import java.io.Serializable;

/**
 * t_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerInfo extends IBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 客户编号
     */
    private String code;
    /**
     * 客户类型
     */
    private String type;
    /**
     * 客户名称
     */
    private String name;
}