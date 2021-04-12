package org.example.spring.infrastructures.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientGroupDao;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientGroup;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientGroupQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientGroupDaoImpl extends TkBaseDaoImpl<TPatientGroup, TPatientGroupQuery, TPatientGroupItemMapper> implements TPatientGroupDao {
    @Override
    protected Wrapper<TPatientGroup> queryWrapper(TPatientGroupQuery tPatientGroupQuery) {
        return null;
    }
}