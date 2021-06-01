package org.example.spring.daos.mssql.report.dao;

import org.example.spring.daos.mssql.report.table.po.TTemplateInfo;
import org.example.spring.daos.mssql.report.table.query.TTemplateInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TTemplateInfoDao extends TkBaseDao<TTemplateInfo, TTemplateInfoQuery> {
}
