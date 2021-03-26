package org.example.domains.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.result.CustomerContractResult;
import org.example.modules.repository.mysql.entity.result.CustomerInfoResult;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerDetailsVo extends IBaseVo {
    private CustomerInfoResult customer;
    private List<CustomerContractResult> contracts;
}