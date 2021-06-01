package org.example.spring.daos.mssql.report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.daos.mssql.report.dao.TReportInfoDao;
import org.example.spring.daos.mssql.report.mapper.TReportInfoMapper;
import org.example.spring.daos.mssql.report.table.po.TReportInfo;
import org.example.spring.daos.mssql.report.table.query.TReportInfoQuery;
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