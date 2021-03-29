package org.example.modules.repository.mysql.helper;

import cn.hutool.core.collection.CollUtil;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.builder.CustomerGroupInfoBuilder;
import org.example.modules.repository.mysql.dao.TCustomerStaffInfoDao;
import org.example.modules.repository.mysql.entity.vo.CustomerStaffInfoFormVo;
import org.example.modules.repository.mysql.entity.vo.StaffInfoVo;
import org.example.plugins.mybatis.entity.vo.IBaseVo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuane
 */
@Component
@AllArgsConstructor
@Transactional
public class CustomerGroupInfoHelper {
    private final TCustomerStaffInfoDao customerStaffInfoDao;
    private final CustomerGroupInfoBuilder customerGroupInfoBuilder;

    public void handleStaffCrud(CustomerStaffInfoFormVo customerStaffInfoFormVo) {
        Long id = customerStaffInfoFormVo.getId();
        List<StaffInfoVo> staffs = customerStaffInfoFormVo.getStaffs();
        List<Long> staffIds = staffs.stream().map(IBaseVo::getId).collect(Collectors.toList());
        List<Long> existStaffIds = customerStaffInfoDao.listStaffIdsByCustomerId(id);
        Collection<Long> intersection = CollUtil.intersection(staffIds, existStaffIds);
        existStaffIds.removeAll(intersection);
        customerStaffInfoDao.removeByIds(existStaffIds);
        customerStaffInfoDao.saveOrUpdateBatch(customerGroupInfoBuilder.createStaffs(staffs));

    }
}