package org.example.spring.daos.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.UserClientBuilder;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.dao.TUserRoleDao;
import org.example.spring.daos.mysql.auth.entity.User;
import org.example.spring.daos.mysql.auth.entity.details.UserDetails;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.po.TUserRole;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@DubboService
@AllArgsConstructor
public class UserDaoClientImpl implements UserDaoClient {
    private final UserClientBuilder builder;
    private final TUserDao userDao;
    private final TUserRoleDao userRoleDao;


    @Override
    public void save(User user) {
        TUser entity = builder.build(user);
        userDao.save(entity);
        List<TUserRole> entityList = builder.build(user.getRoleIds(), entity.getId());
        userRoleDao.saveBatch(entityList);
    }

    @Override
    public void update(User user) {
        Optional<TUser> optional = userDao.getByIdOpt(user.getId());
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            tUser.copy(builder.build(user));
            tUser.setUsername(null);
            tUser.setPassword(null);
            userDao.updateById(tUser);
            userRoleDao.saveBatch(builder.build(user.getRoleIds(), user.getId()));
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
    public User get(Long id) {
        return builder.build(userDao.getById(id));
    }

    @Override
    public Optional<User> getOpt(Long id) {
        return Optional.ofNullable(builder.build(userDao.getById(id)));
    }

    @Override
    public UserDetails getDetails(Long id) {
        UserDetails details = new UserDetails();
        details.setUser(builder.buildDetails(userDao.getById(id)));
        details.setRoles(builder.buildRoleDetails(userRoleDao.listRolesByUserId(id)));
        return details;
    }

    @Override
    public Optional<User> getByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        Optional<TUser> optional = userDao.queryFirst(userQuery);
        return Optional.ofNullable(builder.build(optional.orElse(null)));
    }

    @Override
    public List<User> listByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        List<TUser> list = userDao.queryTop(userQuery, userQuery.getSize());
        return builder.buildList(list);
    }

    @Override
    public List<User> topByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        List<TUser> list = userDao.queryTop(userQuery);
        return builder.buildList(list);
    }

    @Override
    public Stream<User> listStreamByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        Stream<TUser> stream = userDao.queryListStream(userQuery);
        return builder.buildStream(stream);
    }

    @Override
    public Stream<User> topStreamByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        Stream<TUser> stream = userDao.queryTopStream(userQuery);
        return builder.buildStream(stream);
    }

    @Override
    public IPageData<User> dataByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        IPageData<TUser> list = userDao.queryPage(userQuery);
        return builder.buildPage(list);
    }
}