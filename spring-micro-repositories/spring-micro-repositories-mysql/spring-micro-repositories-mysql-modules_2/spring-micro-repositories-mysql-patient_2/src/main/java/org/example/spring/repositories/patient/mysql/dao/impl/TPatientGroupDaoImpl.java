package org.example.spring.repositories.patient.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.repositories.patient.mysql.dao.TPatientGroupDao;
import org.example.spring.repositories.patient.mysql.mapper.TPatientGroupMapper;
import org.example.spring.repositories.patient.mysql.table.po.TPatientGroup;
import org.example.spring.repositories.patient.mysql.table.query.TPatientGroupQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientGroupDaoImpl extends TkBaseDaoImpl<TPatientGroup, TPatientGroupQuery, TPatientGroupMapper> implements TPatientGroupDao {
    @Override
    protected Wrapper<TPatientGroup> queryWrapper(TPatientGroupQuery tPatientGroupQuery) {
        return null;
    }

    @Override
    public boolean existById(Long id) {
        return baseMapper.existById(id);
    }

    @Override
    public boolean removeByTeamIds(List<Long> teamIds) {
        return removeByIds(lambdaQuery().in(TPatientGroup::getTeamId, teamIds).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }
}