package org.example.modules.repository.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.CustomerGroupInfoBuilder;
import org.example.modules.repository.mysql.dao.TCustomerInfoDao;
import org.example.modules.repository.mysql.dao.TCustomerStaffInfoDao;
import org.example.modules.repository.mysql.dao.VCustomerGroupInfoDao;
import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.modules.repository.mysql.entity.query.CustomerGroupInfoQuery;
import org.example.modules.repository.mysql.entity.result.CustomerGroupInfoDetailsResult;
import org.example.modules.repository.mysql.entity.result.CustomerGroupInfoResult;
import org.example.modules.repository.mysql.entity.vo.CustomerGroupInfoFormVo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.entity.vo.StaffInfoVo;
import org.example.modules.repository.mysql.repository.CustomerGroupInfoRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class CustomerGroupInfoRepositoryImpl implements CustomerGroupInfoRepository {
    private final TCustomerInfoDao customerInfoDao;
    private final TCustomerStaffInfoDao customerStaffInfoDao;
    private final VCustomerGroupInfoDao customerGroupInfoDao;
    private final CustomerGroupInfoBuilder customerGroupInfoBuilder;

    @Override
    public void save(CustomerGroupInfoFormVo customerGroupInfoFormVo) {
        saveWithId(customerGroupInfoFormVo);
    }

    @Override
    public Long saveWithId(CustomerGroupInfoFormVo customerGroupInfoFormVo) {
        CustomerInfoVo customer = customerGroupInfoFormVo.getCustomer();
        TCustomerInfo customerInfo = customerGroupInfoBuilder.createCustomer(customer);
        customerInfoDao.save(customerInfo);
        List<StaffInfoVo> staffs = customerGroupInfoFormVo.getStaffs();
        List<TCustomerStaffInfo> staffInfos = customerGroupInfoBuilder.createStaffs(staffs);
        staffInfos = staffInfos.stream().peek(staffInfo -> {
            staffInfo.setCustomerId(customer.getId());
            staffInfo.setCustomerCode(customer.getCode());
        }).collect(Collectors.toList());
        customerStaffInfoDao.saveBatch(staffInfos);
        return customer.getId();
    }

    @Override
    public void update(CustomerGroupInfoFormVo customerGroupInfoFormVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public CustomerGroupInfoDetailsResult getById(Long id) {
        return null;
    }

    @Override
    public IPageData<CustomerGroupInfoResult> queryPage(CustomerGroupInfoQuery customerGroupInfoQuery) {
        return null;
    }

    @Override
    public List<CustomerGroupInfoResult> queryList(CustomerGroupInfoQuery customerGroupInfoQuery) {
        return null;
    }

    @Override
    public CustomerGroupInfoResult queryOne(CustomerGroupInfoQuery customerGroupInfoQuery) {
        return null;
    }
}