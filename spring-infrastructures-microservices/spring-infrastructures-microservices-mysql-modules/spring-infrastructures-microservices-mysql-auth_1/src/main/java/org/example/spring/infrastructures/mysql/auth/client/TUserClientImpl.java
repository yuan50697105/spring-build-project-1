package org.example.spring.infrastructures.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.infrastructures.mysql.auth.builder.AuthClientBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TUserDao;
import org.example.spring.infrastructures.mysql.auth.dao.TUserRoleDao;
import org.example.spring.infrastructures.mysql.auth.entity.ITUser;
import org.example.spring.infrastructures.mysql.auth.entity.query.ITUserQuery;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.example.spring.infrastructures.mysql.auth.table.po.TUserRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@DubboService
@AllArgsConstructor
public class TUserClientImpl implements TUserClient {
    private final AuthClientBuilder authClientBuilder;
    private final TUserDao userDao;
    private final TUserRoleDao userRoleDao;


    @Override
    public void save(ITUser user) {
        TUser entity = authClientBuilder.createForSave(user);
        userDao.save(entity);
        List<TUserRole> entityList = authClientBuilder.createForSaveUserRole(user.getRoleIds(), entity.getId());
        userRoleDao.saveBatch(entityList);
    }

    @Override
    public void update(ITUser user) {
        Optional<TUser> optional = userDao.getByIdOpt(user.getId());
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            tUser.copy(authClientBuilder.createForSave(user));
            tUser.setUsername(null);
            tUser.setPassword(null);
            userDao.updateById(tUser);
            userRoleDao.saveBatch(authClientBuilder.createForSaveUserRole(user.getRoleIds(), user.getId()));
        }
    }

    @Override
    public void updateStatusByIds(String status, List<Long> ids) {
        userDao.updateStatusByIds(status, ids);
    }

    @Override
    public void delete(List<Long> ids) {
        userRoleDao.removeByUserIds(ids);
        userDao.deleteByIds(ids);
    }

    @Override
    public ITUser get(Long id) {
        return authClientBuilder.createForGetUser(userDao.getById(id));
    }

    @Override
    public Optional<ITUser> get(ITUserQuery query) {
        TUserQuery userQuery = authClientBuilder.createForQuery(query);
        Optional<TUser> optional = userDao.queryFirst(userQuery);
        return Optional.ofNullable(authClientBuilder.createForGetUser(optional.orElse(null)));
    }

    @Override
    public List<ITUser> list(ITUserQuery query) {
        TUserQuery userQuery = authClientBuilder.createForQuery(query);
        List<TUser> list = userDao.queryTop(userQuery, userQuery.getSize());
        return authClientBuilder.createForGetUser(list);
    }

    @Override
    public IPageData<ITUser> data(ITUserQuery query) {
        TUserQuery userQuery = authClientBuilder.createForQuery(query);
        IPageData<TUser> list = userDao.queryPage(userQuery);
        return authClientBuilder.createForGetUser(list);
    }
}