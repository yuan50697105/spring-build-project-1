package org.example.spring.repositories.report.mysql.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.report.mysql.dao.TPersonalReportFeeItemsDao;
import org.example.spring.repositories.report.mysql.mapper.TPersonalReportFeeItemsMapper;
import org.example.spring.repositories.report.mysql.table.po.TPersonalReportFeeItems;
import org.example.spring.repositories.report.mysql.table.query.TPersonalReportFeeItemsQuery;
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