package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TCustomerStaffInfo;
import org.example.modules.repository.mysql.entity.query.TCustomerStaffInfoQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TCustomerStaffInfoDao extends TkBaseDao<TCustomerStaffInfo, TCustomerStaffInfoQuery> {
    boolean removeByCustomerIds(List<Long> ids);

    List<Long> listStaffIdsByCustomerId(Long id);

    List<TCustomerStaffInfo> getByCustomerId(Long id);
}
