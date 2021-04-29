package org.example.spring.infrastructures.postgresql.report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.postgresql.report.dao.TReportInfoDao;
import org.example.spring.infrastructures.postgresql.report.mapper.TReportInfoMapper;
import org.example.spring.infrastructures.postgresql.report.table.po.TReportInfo;
import org.example.spring.infrastructures.postgresql.report.table.query.TReportInfoQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TReportInfoDaoImpl extends TkBaseDaoImpl<TReportInfo, TReportInfoQuery, TReportInfoMapper> implements TReportInfoDao {
    @Override
    protected Wrapper<TReportInfo> queryWrapper(TReportInfoQuery tReportInfoQuery) {
        return null;
    }
}