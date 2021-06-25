package org.example.spring.repositories.report.postgres.dao.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.AllArgsConstructor;
import org.example.spring.plugins.mybatis.dao.impl.TkBaseDaoImpl;
import org.example.spring.repositories.report.postgres.dao.TTemplateInfoDao;
import org.example.spring.repositories.report.postgres.mapper.TTemplateInfoMapper;
import org.example.spring.repositories.report.postgres.table.po.TTemplateInfo;
import org.example.spring.repositories.report.postgres.table.query.TTemplateInfoQuery;
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