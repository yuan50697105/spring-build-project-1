package org.example.modules.repository.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.dao.VCustomerGroupInfoDao;
import org.example.modules.repository.mysql.entity.po.VCustomerGroupInfo;
import org.example.modules.repository.mysql.entity.query.VCustomerGroupInfoQuery;
import org.example.modules.repository.mysql.mapper.VCustomerGroupInfoMapper;
import org.example.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class VCustomerGroupInfoDaoImpl extends TkBaseDaoImpl<VCustomerGroupInfo, VCustomerGroupInfoQuery, VCustomerGroupInfoMapper> implements VCustomerGroupInfoDao {
    private final VCustomerGroupInfoMapper customerGroupInfoMapper;

    @Override
    protected Wrapper<VCustomerGroupInfo> queryWrapper(VCustomerGroupInfoQuery vCustomerGroupInfoQuery) {
        return null;
    }
}