package org.example.modules.repository.mysql.entity.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerGroupInfoResult extends IBaseVo {

    private Long customerId;

    private String customerCode;

    private String staffName;

    private String idCardNo;

    private String phone;

    private Integer age;

    private Integer sex;

    private Integer marriage;

    private Integer bear;

    private String customerName;

    private static final long serialVersionUID = 1L;
    ;
}