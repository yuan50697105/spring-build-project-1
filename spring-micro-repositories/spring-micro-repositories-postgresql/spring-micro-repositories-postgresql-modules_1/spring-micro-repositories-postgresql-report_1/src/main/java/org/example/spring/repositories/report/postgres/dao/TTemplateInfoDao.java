package org.example.spring.repositories.report.postgres.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.report.postgres.table.po.TTemplateInfo;
import org.example.spring.repositories.report.postgres.table.query.TTemplateInfoQuery;

public interface TTemplateInfoDao extends TkBaseDao<TTemplateInfo, TTemplateInfoQuery> {
}
