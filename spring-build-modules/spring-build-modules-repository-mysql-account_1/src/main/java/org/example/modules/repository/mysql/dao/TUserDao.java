package org.example.modules.repository.mysql.dao;

import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.plugins.mybatis.dao.TkBaseDao;
import org.example.plugins.mybatis.entity.IPageData;

public interface TUserDao extends TkBaseDao<TUser, TUserQuery> {
    boolean existByUsername(String username);

    IPageData<TUser> queryPage(TUserQuery userQuery);
}
