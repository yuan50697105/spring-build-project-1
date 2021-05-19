package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.converter.TDepartmentConverter;
import org.example.spring.daos.mysql.auth.dao.TDepartmentDao;
import org.example.spring.daos.mysql.auth.repository.TDepartment2Repository;
import org.example.spring.daos.mysql.auth.table.dto.TDepartmentDTO;
import org.example.spring.daos.mysql.auth.table.po.TDepartment;
import org.example.spring.daos.mysql.auth.table.query.TDepartmentQuery;
import org.example.spring.daos.mysql.auth.table.vo.TDepartmentVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TDepartment2RepositoryImpl extends IBaseRepositoryImpl<TDepartment, TDepartmentDTO, TDepartmentVo, TDepartmentQuery, TDepartmentConverter, TDepartmentDao> implements TDepartment2Repository {
}