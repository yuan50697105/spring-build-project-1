package org.example.spring.repositories.patient.oracle.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.patient.oracle.dao.TPatientTeamDao;
import org.example.spring.repositories.patient.oracle.mapper.TPatientTeamMapper;
import org.example.spring.repositories.patient.oracle.table.po.TPatientTeam;
import org.example.spring.repositories.patient.oracle.table.query.TPatientTeamQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientTeamDaoImpl extends TkBaseDaoImpl<TPatientTeam, TPatientTeamQuery, TPatientTeamMapper> implements TPatientTeamDao {
    @Override
    protected Wrapper<TPatientTeam> queryWrapper(TPatientTeamQuery tPatientTeamQuery) {
        return null;
    }

    @Override
    public boolean existById(Long id) {
        return baseMapper.existById(id);
    }
}