package org.example.modules.repository.mysql.entity.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
    * t_customer_info
    */
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerInfo extends IBaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}