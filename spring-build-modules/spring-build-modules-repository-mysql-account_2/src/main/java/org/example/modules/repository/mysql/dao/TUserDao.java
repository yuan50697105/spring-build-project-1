package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;
import org.example.plugins.mybatis.entity.IPageData;

import java.util.List;
import java.util.Optional;

public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
    boolean existByUsername(String username);

    Optional<TUser> getByUsernameOpt(String username);

    void updateStatus(List<Long> ids, int status);
}
