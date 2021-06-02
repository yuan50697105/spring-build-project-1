package org.example.spring.repositories.oracle.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.repositories.oracle.patient.dao.TPatientTeamMealCheckItemDao;
import org.example.spring.repositories.oracle.patient.mapper.TPatientTeamMealCheckItemMapper;
import org.example.spring.repositories.oracle.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.repositories.oracle.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientTeamMealCheckItemDaoImpl extends TkBaseDaoImpl<TPatientTeamMealCheckItem, TPatientTeamMealCheckItemQuery, TPatientTeamMealCheckItemMapper> implements TPatientTeamMealCheckItemDao {
    @Override
    protected Wrapper<TPatientTeamMealCheckItem> queryWrapper(TPatientTeamMealCheckItemQuery tPatientTeamMealCheckItemQuery) {
        return null;
    }

    @Override
    public boolean removeByTeamMealIds(List<Long> ids) {
        return removeByIds(lambdaQuery().in(TPatientTeamMealCheckItem::getTeamMealId, ids).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }
}