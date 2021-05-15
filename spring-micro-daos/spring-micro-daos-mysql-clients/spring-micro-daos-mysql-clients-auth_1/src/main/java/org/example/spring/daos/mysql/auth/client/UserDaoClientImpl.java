package org.example.spring.daos.mysql.auth.client;

import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.spring.daos.mysql.auth.builder.TRoleBuilder;
import org.example.spring.daos.mysql.auth.builder.TUserBuilder;
import org.example.spring.daos.mysql.auth.builder.TUserRoleBuilder;
import org.example.spring.daos.mysql.auth.builder.UserClientBuilder;
import org.example.spring.daos.mysql.auth.dao.TRoleDao;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.dao.TUserRoleDao;
import org.example.spring.daos.mysql.auth.entity.dto.UserDTO;
import org.example.spring.daos.mysql.auth.entity.dto.UserRoleDTO;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.daos.mysql.auth.entity.vo.UserVo;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
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
    private final TUserBuilder userBuilder;
    private final TUserRoleBuilder userRoleBuilder;
    private final TRoleBuilder roleBuilder;
    private final TUserDao userDao;
    private final TRoleDao roleDao;
    private final TUserRoleDao userRoleDao;


    @Override
    public void save(UserVo user) {
        TUserVo userVo = builder.buildVO(user);
        TUser entity = userVo.toUser();
        userDao.save(entity);
        userRoleDao.saveBatch(userVo.toRoles(entity.getId()));
    }

    @Override
    public void update(UserVo user) {
        TUserVo userVo = builder.buildVO(user);
        Optional<TUser> optional = userDao.getByIdOpt(userVo.getId());
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            tUser = userVo.toUserForUpdate(tUser);
            userDao.updateById(tUser);
            userRoleDao.saveBatch(userVo.toRoles(tUser.getId()));
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
        TUser tUser = userDao.getById(id);
        TUserDTO userDTO = userBuilder.buildUser(tUser);
        return builder.build(userDTO);
    }


    @Override
    public Optional<UserDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public UserRoleDTO getDetails(Long id) {
        UserRoleDTO details = builder.buildUser(userDao.getById(id));
        List<TRole> tRoles = userRoleDao.listByUserId(id);
        List<TRoleDTO> tRoleDTO = roleBuilder.buildRoleDTO(tRoles);
        details.setRoles(builder.buildRoleDTO(tRoleDTO));
        return details;
    }

    @Override
    public Optional<UserRoleDTO> getDetailsOpt(Long id) {
        return Optional.ofNullable(getDetails(id));
    }

    @Override
    public UserDTO queryOneByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        TUser tUser = userDao.queryOne(userQuery);
        TUserDTO userDTO = userBuilder.buildUser(tUser);
        return builder.buildUserDTO(userDTO);
    }

    @Override
    public Optional<UserDTO> queryOneByQueryOpt(UserQuery query) {
        return Optional.ofNullable(queryOneByQuery(query));
    }

    @Override
    public UserDTO queryFirstByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        TUser tUser = userDao.queryFirst(userQuery);
        TUserDTO userDTO = userBuilder.buildUser(tUser);
        return builder.buildUserDTO(userDTO);
    }

    @Override
    public Optional<UserDTO> queryFirstByQueryOpt(UserQuery query) {
        return Optional.ofNullable(queryFirstByQuery(query));
    }

    @Override
    public List<UserDTO> queryListByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        List<TUser> list = userDao.queryList(userQuery);
        List<TUserDTO> userDTOS = userBuilder.buildUsers(list);
        return builder.buildListDTO(userDTOS);
    }

    @Override
    public List<UserDTO> queryTopByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        List<TUser> list = userDao.queryTop(userQuery);
        List<TUserDTO> userDTOS = userBuilder.buildUsers(list);
        return builder.buildListDTO(userDTOS);
    }

    @Override
    public Stream<UserDTO> queryListStreamByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        Stream<TUser> stream = userDao.queryListStream(userQuery);
        Stream<TUserDTO> dtoStream = userBuilder.buildUserStream(stream);
        return builder.buildDTOStream(dtoStream);
    }

    @Override
    public Stream<UserDTO> queryTopStreamByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        Stream<TUser> stream = userDao.queryTopStream(userQuery);
        Stream<TUserDTO> dtoStream = userBuilder.buildUserStream(stream);
        return builder.buildDTOStream(dtoStream);
    }

    @Override
    public IPageData<UserDTO> queryPageByQuery(UserQuery query) {
        TUserQuery userQuery = builder.build(query);
        IPageData<TUser> list = userDao.queryPage(userQuery);
        IPageData<TUserDTO> pageData = userBuilder.buildUsers(list);
        return builder.buildPageDTO(pageData);
    }
}