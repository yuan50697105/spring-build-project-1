package org.example.spring.repositories.mysql.report.dao;

import org.example.spring.repositories.mysql.report.table.po.TTemplateInfo;
import org.example.spring.repositories.mysql.report.table.query.TTemplateInfoQuery;
import org.example.spring.plugins.mybatis.dao.TkBaseDao;

public interface TTemplateInfoDao extends TkBaseDao<TTemplateInfo, TTemplateInfoQuery> {
}
