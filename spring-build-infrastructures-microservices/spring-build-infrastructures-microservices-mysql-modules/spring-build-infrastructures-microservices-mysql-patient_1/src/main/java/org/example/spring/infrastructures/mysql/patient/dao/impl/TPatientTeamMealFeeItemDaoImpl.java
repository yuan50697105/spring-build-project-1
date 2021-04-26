package org.example.spring.infrastructures.mysql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.dao.TPatientTeamMealFeeItemDao;
import org.example.spring.infrastructures.mysql.patient.mapper.TPatientTeamMealFeeItemMapper;
import org.example.spring.infrastructures.mysql.patient.table.po.TPatientTeamMealFeeItem;
import org.example.spring.infrastructures.mysql.patient.table.query.TPatientTeamMealFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientTeamMealFeeItemDaoImpl extends TkBaseDaoImpl<TPatientTeamMealFeeItem, TPatientTeamMealFeeItemQuery, TPatientTeamMealFeeItemMapper> implements TPatientTeamMealFeeItemDao {
    @Override
    protected Wrapper<TPatientTeamMealFeeItem> queryWrapper(TPatientTeamMealFeeItemQuery tPatientTeamMealFeeItemQuery) {
        return null;
    }

    @Override
    public boolean removeByTeamMealIds(List<Long> ids) {
        return removeByIds(lambdaQuery().in(TPatientTeamMealFeeItem::getTeamMealId,ids).select(IBaseEntity::getId).list().stream().map(IBaseEntity::getId).collect(Collectors.toList()));
    }

    @Override
    public List<TPatientTeamMealFeeItem> listByTeamMealId(Long id) {
        return lambdaQuery().eq(TPatientTeamMealFeeItem::getTeamMealId, id).list();
    }
}