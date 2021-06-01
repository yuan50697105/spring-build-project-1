package org.example.spring.repositories.postgres.report.dao;

import org.example.spring.repositories.postgres.report.table.po.TTemplateInfo;
import org.example.spring.repositories.postgres.report.table.query.TTemplateInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TTemplateInfoDao extends TkBaseDao<TTemplateInfo, TTemplateInfoQuery> {
}
