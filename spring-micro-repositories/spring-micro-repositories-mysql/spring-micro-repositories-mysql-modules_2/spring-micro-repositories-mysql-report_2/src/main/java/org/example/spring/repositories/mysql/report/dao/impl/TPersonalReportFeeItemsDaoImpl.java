package org.example.spring.repositories.mysql.report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.repositories.mysql.report.dao.TPersonalReportFeeItemsDao;
import org.example.spring.repositories.mysql.report.mapper.TPersonalReportFeeItemsMapper;
import org.example.spring.repositories.mysql.report.table.po.TPersonalReportFeeItems;
import org.example.spring.repositories.mysql.report.table.query.TPersonalReportFeeItemsQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TPersonalReportFeeItemsDaoImpl extends TkBaseDaoImpl<TPersonalReportFeeItems, TPersonalReportFeeItemsQuery, TPersonalReportFeeItemsMapper> implements TPersonalReportFeeItemsDao {
    @Override
    protected Wrapper<TPersonalReportFeeItems> queryWrapper(TPersonalReportFeeItemsQuery tPersonalReportFeeItemsQuery) {
        return null;
    }
}