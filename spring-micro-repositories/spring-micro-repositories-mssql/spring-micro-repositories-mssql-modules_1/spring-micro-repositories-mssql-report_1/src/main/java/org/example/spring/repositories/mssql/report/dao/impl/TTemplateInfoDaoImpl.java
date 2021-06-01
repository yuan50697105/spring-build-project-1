package org.example.spring.repositories.mssql.report.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.repositories.mssql.report.dao.TTemplateInfoDao;
import org.example.spring.repositories.mssql.report.mapper.TTemplateInfoMapper;
import org.example.spring.repositories.mssql.report.table.po.TTemplateInfo;
import org.example.spring.repositories.mssql.report.table.query.TTemplateInfoQuery;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TTemplateInfoDaoImpl extends TkBaseDaoImpl<TTemplateInfo, TTemplateInfoQuery, TTemplateInfoMapper> implements TTemplateInfoDao {
    @Override
    protected Wrapper<TTemplateInfo> queryWrapper(TTemplateInfoQuery tTemplateInfoQuery) {
        return null;
    }
}