package org.example.spring.infrastructures.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamMealCheckItemDao;
import org.example.spring.infrastructures.mysql.patient.mapper.TPatientTeamMealCheckItemMapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealCheckItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientTeamMealCheckItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        return remove(lambdaQuery().in(TPatientTeamMealCheckItem::getTeamMealId, ids));
    }
}