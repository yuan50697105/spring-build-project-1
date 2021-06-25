package org.example.spring.repositories.patient.mssql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.patient.mssql.dao.TPatientCheckItemDao;
import org.example.spring.repositories.patient.mssql.mapper.TPatientCheckItemMapper;
import org.example.spring.repositories.patient.mssql.table.po.TPatientCheckItem;
import org.example.spring.repositories.patient.mssql.table.query.TPatientCheckItemQuery;
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