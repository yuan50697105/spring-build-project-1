package org.example.modules.repository.mysql.entity.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class VCustomerGroupInfo extends IBaseEntity implements Serializable {
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
}