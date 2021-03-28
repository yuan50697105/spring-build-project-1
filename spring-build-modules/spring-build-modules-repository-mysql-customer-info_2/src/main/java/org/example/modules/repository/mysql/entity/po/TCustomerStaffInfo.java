package org.example.modules.repository.mysql.entity.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

/**
 * t_customer_staff_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TCustomerStaffInfo extends IBaseEntity implements Serializable {
    /**
     * 客户信息Id
     */
    private Long customerId;

    /**
     * 客户信息Code
     */
    private String customerCode;

    /**
     * 人员姓名
     */
    private String staffName;

    /**
     * idCardNo
     */
    private String idCardNo;

    /**
     * phone
     */
    private String phone;

    /**
     * age
     */
    private Integer age;

    /**
     * sex
     */
    private Integer sex;

    /**
     * marriage
     */
    private Integer marriage;

    /**
     * 生育
     */
    private Integer bear;

    private static final long serialVersionUID = 1L;
}