package org.example.spring.daos.mssql.auth.repository;

import org.example.spring.daos.mssql.auth.table.dto.TUserDto;
import org.example.spring.daos.mssql.auth.table.po.TUser;
import org.example.spring.daos.mssql.auth.table.query.TUserQuery;
import org.example.spring.daos.mssql.auth.table.vo.TUserVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TUserRepository extends IBaseRepository<TUser, TUserDto, TUserVo, TUserQuery> {
}
