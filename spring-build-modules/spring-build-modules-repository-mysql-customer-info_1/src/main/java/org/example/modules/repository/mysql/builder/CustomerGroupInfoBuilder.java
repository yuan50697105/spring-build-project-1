package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.modules.repository.mysql.entity.po.VCustomerGroupInfo;
import org.example.modules.repository.mysql.entity.query.CustomerGroupInfoQuery;
import org.example.modules.repository.mysql.entity.query.VCustomerGroupInfoQuery;
import org.example.modules.repository.mysql.entity.result.CustomerStaffInfoResult;
import org.example.modules.repository.mysql.entity.result.CustomerInfoResult;
import org.example.modules.repository.mysql.entity.result.StaffInfoResult;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.entity.vo.StaffInfoVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerGroupInfoBuilder {
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TCustomerInfo createCustomer(CustomerInfoVo customer);

    List<TCustomerStaffInfo> createStaffs(List<StaffInfoVo> staffs);

    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    void copyCustomer(CustomerInfoVo customer, @MappingTarget TCustomerInfo customerInfo);

    CustomerStaffInfoResult createCustomerGroupInfo(VCustomerGroupInfo customerGroupInfo);

    CustomerInfoResult createCustomer(TCustomerInfo customerInfo);

    List<StaffInfoResult> createCustomerStaffs(List<TCustomerStaffInfo> staffInfos);

    VCustomerGroupInfoQuery createQuery(CustomerGroupInfoQuery customerGroupInfoQuery);

    List<CustomerStaffInfoResult> createCustomerGroupInfo(List<VCustomerGroupInfo> customerGroupInfo);

    IPageData<CustomerStaffInfoResult> createCustomerGroupInfo(IPageData<VCustomerGroupInfo> customerGroupInfo);
}
