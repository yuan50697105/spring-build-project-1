package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.TCustomerStaffInfoDao;
import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.modules.repository.mysql.entity.query.TCustomerStaffInfoQuery;
import org.example.modules.repository.mysql.mapper.TCustomerStaffInfoMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
@Transactional
public class TCustomerStaffInfoDaoImpl extends TkBaseDaoImpl<TCustomerStaffInfo, TCustomerStaffInfoQuery, TCustomerStaffInfoMapper> implements TCustomerStaffInfoDao {
    @Override
    protected Wrapper<TCustomerStaffInfo> queryWrapper(TCustomerStaffInfoQuery tCustomerStaffInfoQuery) {
        return null;
    }

    @Override
    public boolean removeByCustomerIds(List<Long> ids) {
        return lambdaUpdate().in(TCustomerStaffInfo::getCustomerId, ids).remove();
    }

    @Override
    public List<Long> listStaffIdsByCustomerId(Long id) {
        return lambdaQuery().eq(TCustomerStaffInfo::getCustomerId, id).select(IBaseEntity::getId).list().stream().map(TCustomerStaffInfo::getCustomerId).collect(Collectors.toList());
    }

    @Override
    public List<TCustomerStaffInfo> getByCustomerId(Long id) {
        return lambdaQuery().eq(TCustomerStaffInfo::getCustomerId, id).list();
    }
}