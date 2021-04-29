package org.example.spring.infrastructures.postgresql.report.dao;

import org.example.spring.infrastructures.postgresql.report.table.po.TTemplateInfo;
import org.example.spring.infrastructures.postgresql.report.table.query.TTemplateInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TTemplateInfoDao extends TkBaseDao<TTemplateInfo, TTemplateInfoQuery> {
}
