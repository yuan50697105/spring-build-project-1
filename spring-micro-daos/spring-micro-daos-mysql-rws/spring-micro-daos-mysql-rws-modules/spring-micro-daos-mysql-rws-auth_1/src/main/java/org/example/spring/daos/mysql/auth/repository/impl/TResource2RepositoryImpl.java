package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.converter.TResourceConverter;
import org.example.spring.daos.mysql.auth.dao.TResourceDao;
import org.example.spring.daos.mysql.auth.repository.TResource2Repository;
import org.example.spring.daos.mysql.auth.table.dto.TResourceDTO;
import org.example.spring.daos.mysql.auth.table.po.TResource;
import org.example.spring.daos.mysql.auth.table.query.TResourceQuery;
import org.example.spring.daos.mysql.auth.table.vo.TResourceVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TResource2RepositoryImpl extends IBaseRepositoryImpl<TResource, TResourceDTO, TResourceVo, TResourceQuery, TResourceConverter, TResourceDao> implements TResource2Repository {
}