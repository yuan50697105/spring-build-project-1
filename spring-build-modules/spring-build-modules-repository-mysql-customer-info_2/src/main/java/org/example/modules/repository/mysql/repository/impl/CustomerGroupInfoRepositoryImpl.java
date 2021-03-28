package org.example.modules.repository.mysql.repository.impl;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.CustomerGroupInfoBuilder;
import org.example.modules.repository.mysql.dao.TCustomerInfoDao;
import org.example.modules.repository.mysql.dao.TCustomerStaffInfoDao;
import org.example.modules.repository.mysql.dao.VCustomerGroupInfoDao;
import org.example.modules.repository.mysql.entity.po.TCustomerInfo;
import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.modules.repository.mysql.entity.po.VCustomerGroupInfo;
import org.example.modules.repository.mysql.entity.query.CustomerGroupInfoQuery;
import org.example.modules.repository.mysql.entity.query.VCustomerGroupInfoQuery;
import org.example.modules.repository.mysql.entity.result.CustomerGroupInfoDetailsResult;
import org.example.modules.repository.mysql.entity.result.CustomerGroupInfoResult;
import org.example.modules.repository.mysql.entity.vo.CustomerGroupInfoFormVo;
import org.example.modules.repository.mysql.entity.vo.CustomerInfoVo;
import org.example.modules.repository.mysql.entity.vo.StaffInfoVo;
import org.example.modules.repository.mysql.helper.CustomerGroupInfoHelper;
import org.example.modules.repository.mysql.repository.CustomerGroupInfoRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class CustomerGroupInfoRepositoryImpl implements CustomerGroupInfoRepository {
    private final TCustomerInfoDao customerInfoDao;
    private final TCustomerStaffInfoDao customerStaffInfoDao;
    private final VCustomerGroupInfoDao customerGroupInfoDao;
    private final CustomerGroupInfoBuilder customerGroupInfoBuilder;
    private final CustomerGroupInfoHelper customerGroupInfoHelper;

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
        Optional<TCustomerInfo> optional = customerInfoDao.getByIdOpt(customerGroupInfoFormVo.getId());
        if (optional.isPresent()) {
            TCustomerInfo customerInfo = optional.get();
            customerGroupInfoBuilder.copyCustomer(customerGroupInfoFormVo.getCustomer(), customerInfo);
            customerInfoDao.updateById(customerInfo);
            customerGroupInfoHelper.handleStaffCrud(customerGroupInfoFormVo);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoDao.removeByIds(ids);
        customerStaffInfoDao.removeByCustomerIds(ids);
    }

    @Override
    public CustomerGroupInfoDetailsResult getById(Long id) {
        CustomerGroupInfoDetailsResult customerGroupInfoDetailsResult = new CustomerGroupInfoDetailsResult();
        TCustomerInfo customerInfo = customerInfoDao.getById(id);
        customerGroupInfoDetailsResult.setCustomer(customerGroupInfoBuilder.createCustomer(customerInfo));
        customerGroupInfoDetailsResult.setStaffs(customerGroupInfoBuilder.createCustomerStaffs(customerStaffInfoDao.getByCustomerId(id)));
        return customerGroupInfoDetailsResult;
    }

    @Override
    public CustomerGroupInfoResult queryOne(CustomerGroupInfoQuery customerGroupInfoQuery) {
        VCustomerGroupInfoQuery query = getQuery(customerGroupInfoQuery);
        VCustomerGroupInfo customerGroupInfo = customerGroupInfoDao.queryOne(query);
        return customerGroupInfoBuilder.createCustomerGroupInfo(customerGroupInfo);
    }

    @Override
    public List<CustomerGroupInfoResult> queryList(CustomerGroupInfoQuery customerGroupInfoQuery) {
        VCustomerGroupInfoQuery query = getQuery(customerGroupInfoQuery);
        List<VCustomerGroupInfo> customerGroupInfo = customerGroupInfoDao.queryList(query);
        return customerGroupInfoBuilder.createCustomerGroupInfo(customerGroupInfo);
    }

    @Override
    public IPageData<CustomerGroupInfoResult> queryPage(CustomerGroupInfoQuery customerGroupInfoQuery) {
        VCustomerGroupInfoQuery query = getQuery(customerGroupInfoQuery);
        IPageData<VCustomerGroupInfo> customerGroupInfo = customerGroupInfoDao.queryPage(query);
        return customerGroupInfoBuilder.createCustomerGroupInfo(customerGroupInfo);
    }

    private VCustomerGroupInfoQuery getQuery(CustomerGroupInfoQuery customerGroupInfoQuery) {
        return customerGroupInfoBuilder.createQuery(customerGroupInfoQuery);
    }
}