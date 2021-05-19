package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.builder.TUserBuilder;
import org.example.spring.daos.mysql.auth.builder.TUserRoleBuilder;
import org.example.spring.daos.mysql.auth.dao.TUserDao;
import org.example.spring.daos.mysql.auth.dao.TUserRoleDao;
import org.example.spring.daos.mysql.auth.repository.TRoleRepository;
import org.example.spring.daos.mysql.auth.repository.TUserRepository;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
@Transactional
public class TUserRepositoryImpl implements TUserRepository {
    private final TUserDao userDao;
    private final TUserRoleDao userRoleDao;
    private final TUserBuilder userBuilder;
    private final TUserRoleBuilder userRoleBuilder;
    private final TRoleRepository roleRepository;

    @Override
    public void save(TUserVo vo) {
        TUser entity = userBuilder.buildUser(vo);
        userDao.save(entity);
        userRoleDao.saveBatch(userRoleBuilder.buildRoles(entity.getId(), vo.getRoleIds()));
    }

    @Override
    public void update(TUserVo vo) {
        TUser user = userBuilder.buildUser(vo);
        Optional<TUser> optional = userDao.getByIdOpt(user.getId());
        if (optional.isPresent()) {
            TUser tUser = optional.get();
            userBuilder.copy(user, tUser);
            userDao.update(tUser);
            userRoleDao.deleteByUserId(user.getId());
            userRoleDao.saveBatch(userRoleBuilder.buildRoles(user.getId(), vo.getRoleIds()));
        }
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
        userRoleDao.deleteByUserId(id);
    }

    @Override
    public void delete(Long... ids) {
        userDao.deleteByIds(ids);
        userRoleDao.deleteByUserIds(Arrays.asList(ids));
    }

    @Override
    public void delete(List<Long> ids) {
        userDao.deleteByIds(ids);
        userRoleDao.deleteByUserIds(ids);
    }

    @Override
    public TUserDTO get(Long id) {
        return userBuilder.buildUser(userDao.getById(id));
    }

    @Override
    public Optional<TUserDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TUserDTO queryOne(TUserQuery query) {
        return userBuilder.buildUser(userDao.queryOne(query));
    }

    @Override
    public TUserDTO selectOne(TUserQuery query) {
        return userBuilder.buildUser(userDao.selectOne(query));
    }

    @Override
    public Optional<TUserDTO> selectOneOpt(TUserQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public Optional<TUserDTO> queryOneOpt(TUserQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public TUserDTO queryFirst(TUserQuery query) {
        return userBuilder.buildUser(userDao.queryFirst(query));
    }

    @Override
    public Optional<TUserDTO> queryFirstOpt(TUserQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TUserDTO selectFirst(TUserQuery query) {
        return userBuilder.buildUser(userDao.selectFirst(query));
    }

    @Override
    public Optional<TUserDTO> selectFirstOpt(TUserQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TUserDTO> queryList(TUserQuery query) {
        return userBuilder.buildUsers(userDao.queryList(query));
    }

    @Override
    public List<TUserDTO> selectList(TUserQuery query) {
        return userBuilder.buildUsers(userDao.selectList(query));
    }

    @Override
    public Stream<TUserDTO> queryStream(TUserQuery query) {
        return userBuilder.buildUsers(userDao.queryListStream(query));
    }

    @Override
    public Stream<TUserDTO> selectStream(TUserQuery query) {
        return userBuilder.buildUsers(userDao.selectListStream(query));
    }

    @Override
    public List<TUserDTO> queryTop(TUserQuery query) {
        return userBuilder.buildUsers(userDao.queryTop(query));
    }

    @Override
    public Stream<TUserDTO> queryTopStream(TUserQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public List<TUserDTO> selectTop(TUserQuery query) {
        return userBuilder.buildUsers(userDao.selectTop(query));
    }

    @Override
    public Stream<TUserDTO> selectTopStream(TUserQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TUserDTO> selectPage(TUserQuery query) {
        return null;
    }

    @Override
    public IPageData<TUserDTO> queryPage(TUserQuery query) {
        return null;
    }

    @Override
    public TUserRoleDTO getDetails(Long id) {
        return userBuilder.buildUser(get(id), roleRepository.queryListByUserId(id));
    }
}