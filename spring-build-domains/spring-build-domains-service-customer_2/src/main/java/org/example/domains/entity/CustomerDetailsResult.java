package org.example.domains.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.result.CustomerInfo;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerDetailsResult extends IBaseVo {
    private CustomerInfo customer;
}