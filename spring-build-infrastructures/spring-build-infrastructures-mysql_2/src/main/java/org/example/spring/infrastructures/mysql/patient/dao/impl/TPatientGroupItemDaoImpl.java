package org.example.spring.infrastructures.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupItemDao;
import org.example.spring.infrastructures.mysql.patient.mapper.TPatientGroupItemMapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroupItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientGroupItemDaoImpl extends TkBaseDaoImpl<TPatientGroupItem, TPatientGroupItemQuery, TPatientGroupItemMapper> implements TPatientGroupItemDao {
    @Override
    protected Wrapper<TPatientGroupItem> queryWrapper(TPatientGroupItemQuery tPatientGroupItemQuery) {
        return null;
    }
}