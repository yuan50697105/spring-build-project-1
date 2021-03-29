package org.example.domains.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.result.CustomerContract;
import org.example.modules.repository.mysql.entity.result.CustomerInfo;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerDetailsResult extends IBaseVo {
    private CustomerInfo customer;
    private List<CustomerContract> contracts;
}