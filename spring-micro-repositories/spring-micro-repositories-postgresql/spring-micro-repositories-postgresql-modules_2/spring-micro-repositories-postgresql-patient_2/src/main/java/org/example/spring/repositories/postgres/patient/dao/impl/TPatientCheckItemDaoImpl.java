package org.example.spring.repositories.postgres.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.postgres.patient.dao.TPatientCheckItemDao;
import org.example.spring.repositories.postgres.patient.mapper.TPatientCheckItemMapper;
import org.example.spring.repositories.postgres.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.postgres.patient.table.query.TPatientCheckItemQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientCheckItemDaoImpl extends TkBaseDaoImpl<TPatientCheckItem, TPatientCheckItemQuery, TPatientCheckItemMapper> implements TPatientCheckItemDao {
    @Override
    protected Wrapper<TPatientCheckItem> queryWrapper(TPatientCheckItemQuery tPatientCheckItemQuery) {
        return null;
    }
}