package org.example.spring.repositories.mssql.report.dao;

import org.example.spring.repositories.mssql.report.table.po.TTemplateInfo;
import org.example.spring.repositories.mssql.report.table.query.TTemplateInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TTemplateInfoDao extends TkBaseDao<TTemplateInfo, TTemplateInfoQuery> {
}
