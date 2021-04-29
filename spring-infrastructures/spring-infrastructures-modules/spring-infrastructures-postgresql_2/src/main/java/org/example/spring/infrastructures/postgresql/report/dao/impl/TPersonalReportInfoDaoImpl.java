package org.example.spring.infrastructures.postgresql.report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.postgresql.report.dao.TPersonalReportInfoDao;
import org.example.spring.infrastructures.postgresql.report.mapper.TPersonalReportInfoMapper;
import org.example.spring.infrastructures.postgresql.report.table.po.TPersonalReportInfo;
import org.example.spring.infrastructures.postgresql.report.table.query.TPersonalReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPersonalReportInfoDaoImpl extends TkBaseDaoImpl<TPersonalReportInfo, TPersonalReportInfoQuery, TPersonalReportInfoMapper> implements TPersonalReportInfoDao {
    @Override
    protected Wrapper<TPersonalReportInfo> queryWrapper(TPersonalReportInfoQuery tPersonalReportInfoQuery) {
        return null;
    }
}