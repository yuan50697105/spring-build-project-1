package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.converter.TUserConverter;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.repository.TResource2Repository;
import org.example.spring.daos.mysql.auth.repository.TRole2Repository;
import org.example.spring.daos.mysql.auth.repository.TUser2Repository;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserDetailsDTO;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
@Transactional
public class TUser2RepositoryImpl extends IBaseRepositoryImpl<TUser, TUserDTO, TUserVo, TUserQuery, TUserConverter, TUserDao> implements TUser2Repository {
    private final TRole2Repository role2Repository;
    private final TResource2Repository resource2Repository;
    @Override
    public TUserDetailsDTO getDetails(Long id) {
        TUserDetailsDTO dto = converter.buildDTO2(get(id));
        dto.setRoles(role2Repository.queryListByUserId(id));
        dto.setResources(resource2Repository.queryListByUserId(id));
        return dto;
    }
}