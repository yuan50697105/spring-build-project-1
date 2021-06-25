package org.example.spring.repositories.report.postgres.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.report.postgres.dao.TPersonalReportCheckItemsDao;
import org.example.spring.repositories.report.postgres.mapper.TPersonalReportCheckItemsMapper;
import org.example.spring.repositories.report.postgres.table.po.TPersonalReportCheckItems;
import org.example.spring.repositories.report.postgres.table.query.TPersonalReportCheckItemsQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPersonalReportCheckItemsDaoImpl extends TkBaseDaoImpl<TPersonalReportCheckItems, TPersonalReportCheckItemsQuery, TPersonalReportCheckItemsMapper> implements TPersonalReportCheckItemsDao {
    @Override
    protected Wrapper<TPersonalReportCheckItems> queryWrapper(TPersonalReportCheckItemsQuery tPersonalReportCheckItemsQuery) {
        return null;
    }
}