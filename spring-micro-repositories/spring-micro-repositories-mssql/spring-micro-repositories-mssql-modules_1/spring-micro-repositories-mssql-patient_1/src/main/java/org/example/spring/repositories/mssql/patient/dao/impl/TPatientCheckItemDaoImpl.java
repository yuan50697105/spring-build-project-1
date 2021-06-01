package org.example.spring.repositories.mssql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.mssql.patient.dao.TPatientCheckItemDao;
import org.example.spring.repositories.mssql.patient.mapper.TPatientCheckItemMapper;
import org.example.spring.repositories.mssql.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.mssql.patient.table.query.TPatientCheckItemQuery;
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