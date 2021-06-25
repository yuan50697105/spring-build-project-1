package org.example.spring.repositories.report.postgres.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.report.postgres.dao.TPersonalReportInfoDao;
import org.example.spring.repositories.report.postgres.mapper.TPersonalReportInfoMapper;
import org.example.spring.repositories.report.postgres.table.po.TPersonalReportInfo;
import org.example.spring.repositories.report.postgres.table.query.TPersonalReportInfoQuery;
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