package org.example.spring.repositories.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.patient.dao.TPatientCheckItemDao;
import org.example.spring.daos.mysql.patient.mapper.TPatientCheckItemMapper;
import org.example.spring.daos.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.daos.mysql.patient.table.query.TPatientCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.mysql.patient.dao.TPatientCheckItemDao;
import org.example.spring.repositories.mysql.patient.mapper.TPatientCheckItemMapper;
import org.example.spring.repositories.mysql.patient.table.po.TPatientCheckItem;
import org.example.spring.repositories.mysql.patient.table.query.TPatientCheckItemQuery;
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