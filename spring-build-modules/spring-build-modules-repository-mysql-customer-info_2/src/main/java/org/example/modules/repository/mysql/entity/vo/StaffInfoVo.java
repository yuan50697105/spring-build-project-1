package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class StaffInfoVo extends IBaseVo {

    private static final long serialVersionUID = 1L;
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

}