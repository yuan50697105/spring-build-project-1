package org.example.spring.infrastructures.mysql.patient.dao;

import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupItemQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

import java.util.List;

public interface TPatientGroupItemDao extends TkBaseDao<TPatientGroupItem, TPatientGroupItemQuery> {
    boolean removeByGroupIds(List<Long> ids);

    List<TPatientGroupItem> listByGroupId(Long id);
}
