package org.example.spring.repositories.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.patient.mapper.TPatientTeamMapper;
import org.example.spring.daos.mysql.patient.table.po.TPatientTeam;
import org.example.spring.daos.mysql.patient.table.query.TPatientTeamQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.mysql.patient.dao.TPatientTeamDao;
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