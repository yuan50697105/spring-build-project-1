package org.example.spring.repositories.oracle.report.dao;

import org.example.spring.plugins.mybatis.dao.TkBaseDao;
import org.example.spring.repositories.oracle.report.table.po.TTemplateInfo;
import org.example.spring.repositories.oracle.report.table.query.TTemplateInfoQuery;

public interface TTemplateInfoDao extends TkBaseDao<TTemplateInfo, TTemplateInfoQuery> {
}