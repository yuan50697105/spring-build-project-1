package org.example.spring.daos.mysql.auth.repository;

import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.mybatis.repository.IBaseRepository;

public interface TUser2Repository extends IBaseRepository<TUser, TUserDTO, TUserVo, TUserQuery> {
}
