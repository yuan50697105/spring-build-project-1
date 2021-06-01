package org.example.spring.repositories.mssql.patient.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.repositories.mssql.patient.dao.TPatientFeeItemDao;
import org.example.spring.repositories.mssql.patient.mapper.TPatientFeeItemMapper;
import org.example.spring.repositories.mssql.patient.table.po.TPatientFeeItem;
import org.example.spring.repositories.mssql.patient.table.query.TPatientFeeItemQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPatientFeeItemDaoImpl extends TkBaseDaoImpl<TPatientFeeItem, TPatientFeeItemQuery, TPatientFeeItemMapper> implements TPatientFeeItemDao {
    @Override
    protected Wrapper<TPatientFeeItem> queryWrapper(TPatientFeeItemQuery tPatientFeeItemQuery) {
        return null;
    }
}