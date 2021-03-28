package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.entity.vo.StaffInfoVo;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerGroupInfoBuilder {
    TCustomerInfo createCustomer(CustomerInfoVo customer);

    List<TCustomerStaffInfo> createStaffs(List<StaffInfoVo> staffs);
}
