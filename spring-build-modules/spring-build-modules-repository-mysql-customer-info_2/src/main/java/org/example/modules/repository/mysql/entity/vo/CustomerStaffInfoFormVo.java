package org.example.modules.repository.mysql.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerStaffInfoFormVo extends IBaseVo {
    private CustomerInfoVo customer;
    private List<StaffInfoVo> staffs;
}