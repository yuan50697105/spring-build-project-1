package org.example.domains.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoFormVo;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerVo extends IBaseVo {
    private CustomerInfoFormVo customer;
    private CustomerContractFormVo contract;
}