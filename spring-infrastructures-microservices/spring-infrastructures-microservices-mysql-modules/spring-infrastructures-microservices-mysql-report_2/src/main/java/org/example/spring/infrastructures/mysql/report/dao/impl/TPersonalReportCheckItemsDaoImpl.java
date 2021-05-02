package org.example.spring.infrastructures.mysql.report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.report.dao.TPersonalReportCheckItemsDao;
import org.example.spring.infrastructures.mysql.report.mapper.TPersonalReportCheckItemsMapper;
import org.example.spring.infrastructures.mysql.report.table.po.TPersonalReportCheckItems;
import org.example.spring.infrastructures.mysql.report.table.query.TPersonalReportCheckItemsQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
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