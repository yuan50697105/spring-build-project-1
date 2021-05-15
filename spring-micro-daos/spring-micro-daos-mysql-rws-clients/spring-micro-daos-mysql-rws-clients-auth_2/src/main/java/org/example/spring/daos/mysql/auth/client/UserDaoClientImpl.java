package org.example.spring.daos.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.UserClientBuilder;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.dao.TUserRoleDao;
import org.example.spring.daos.mysql.auth.entity.vo.UserVo;
import org.example.spring.daos.mysql.auth.entity.dto.UserDTO;
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
    public void save(UserVo userVo) {
        TUser entity = builder.build(userVo);
        userDao.save(entity);
        List<TUserRole> entityList = builder.build(userVo.getRoleIds(), entity.getId());
        userRoleDao.saveBatch(entityList);
    }

    @Override
    public void update(UserVo userVo) {
        Optional<TUser> optional = userDao.getByIdOpt(userVo.getId());
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            tUser.copy(builder.build(userVo));
            tUser.setUsername(null);
            tUser.setPassword(null);
            userDao.updateById(tUser);
            userRoleDao.saveBatch(builder.build(userVo.getRoleIds(), userVo.getId()));
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
    public UserDTO get(Long id) {
        return builder.build(userDao.getById(id));
    }

    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return Optional.ofNullable(builder.build(userDao.getById(id)));
    }

    @Override
    public UserDTO getDetails(Long id) {
        UserDTO details = new UserDTO();
        details.setUser(builder.buildDetails(userDao.getById(id)));
        details.setRoles(builder.buildRoleDetails(userRoleDao.listRolesByUserId(id)));
        return details;
    }

    @Override
    public Optional<UserDTO> queryOneByQueryOpt(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        Optional<TUser> optional = userDao.queryFirst(userQuery);
        return Optional.ofNullable(builder.build(optional.orElse(null)));
    }

    @Override
    public List<UserDTO> queryListByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        List<TUser> list = userDao.queryTop(userQuery, userQuery.getSize());
        return builder.buildList(list);
    }

    @Override
    public List<UserDTO> queryTopByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        List<TUser> list = userDao.queryTop(userQuery);
        return builder.buildList(list);
    }

    @Override
    public Stream<UserDTO> queryListStreamByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        Stream<TUser> stream = userDao.queryListStream(userQuery);
        return builder.buildStream(stream);
    }

    @Override
    public Stream<UserDTO> queryTopStreamByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        Stream<TUser> stream = userDao.queryTopStream(userQuery);
        return builder.buildStream(stream);
    }

    @Override
    public IPageData<UserDTO> queryPageByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        IPageData<TUser> list = userDao.queryPage(userQuery);
        return builder.buildPage(list);
    }
}