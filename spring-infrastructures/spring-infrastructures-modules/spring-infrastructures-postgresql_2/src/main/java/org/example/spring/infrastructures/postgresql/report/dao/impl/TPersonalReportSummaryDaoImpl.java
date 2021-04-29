package org.example.spring.infrastructures.postgresql.report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.postgresql.report.dao.TPersonalReportSummaryDao;
import org.example.spring.infrastructures.postgresql.report.mapper.TPersonalReportSummaryMapper;
import org.example.spring.infrastructures.postgresql.report.table.po.TPersonalReportSummary;
import org.example.spring.infrastructures.postgresql.report.table.query.TPersonalReportSummaryQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPersonalReportSummaryDaoImpl extends TkBaseDaoImpl<TPersonalReportSummary, TPersonalReportSummaryQuery, TPersonalReportSummaryMapper> implements TPersonalReportSummaryDao {
    @Override
    protected Wrapper<TPersonalReportSummary> queryWrapper(TPersonalReportSummaryQuery tPersonalReportSummaryQuery) {
        return null;
    }
}