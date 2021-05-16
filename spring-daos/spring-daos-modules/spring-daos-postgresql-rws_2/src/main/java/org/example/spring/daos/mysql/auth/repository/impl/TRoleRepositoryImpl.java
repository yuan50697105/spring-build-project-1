package org.example.spring.daos.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.mysql.auth.builder.TRoleBuilder;
import org.example.spring.daos.mysql.auth.dao.TRoleDao;
import org.example.spring.daos.mysql.auth.dao.TRoleResourceDao;
import org.example.spring.daos.mysql.auth.dao.TUserRoleDao;
import org.example.spring.daos.mysql.auth.repository.TRoleRepository;
import org.example.spring.daos.mysql.auth.table.dto.TRoleDTO;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.query.TRoleQuery;
import org.example.spring.daos.mysql.auth.table.vo.TRoleVo;
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
public class TRoleRepositoryImpl implements TRoleRepository {
    private final TRoleBuilder roleBuilder;
    private final TRoleDao roleDao;
    private final TRoleResourceDao roleResourceDao;
    private final TUserRoleDao userRoleDao;

    @Override
    public void save(TRoleVo vo) {
        TRole entity = roleBuilder.buildRole(vo);
        roleDao.save(entity);
        roleResourceDao.saveNew(entity.getId(), vo.getResourceIds());
    }

    @Override
    public void update(TRoleVo vo) {
        TRole role = roleBuilder.buildRole(vo);
        Optional<TRole> optional = roleDao.getByIdOpt(role.getId());
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            roleBuilder.copy(role, tRole);
            roleDao.update(tRole);
            roleResourceDao.saveUpdate(role.getId(), vo.getResourceIds());
        }
    }

    @Override
    public void delete(Long id) {
        roleDao.deleteById(id);
        roleResourceDao.deleteByRoleId(id);
        userRoleDao.deleteByRoleId(id);
    }

    @Override
    public void delete(Long... ids) {
        roleDao.deleteByIds(ids);
        roleResourceDao.deleteByRoleIds(Arrays.asList(ids));
        userRoleDao.deleteByRoleIds(Arrays.asList(ids));
    }

    @Override
    public void delete(List<Long> ids) {
        roleDao.deleteByIds(ids);
        roleResourceDao.deleteByRoleIds(ids);
        userRoleDao.deleteByRoleIds(ids);
    }

    @Override
    public TRoleDTO get(Long id) {
        return roleBuilder.buildRole(roleDao.getById(id));
    }

    @Override
    public Optional<TRoleDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public TRoleDTO queryOne(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.queryOne(query));
    }

    @Override
    public TRoleDTO selectOne(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.selectOne(query));
    }

    @Override
    public Optional<TRoleDTO> selectOneOpt(TRoleQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    @Override
    public Optional<TRoleDTO> queryOneOpt(TRoleQuery query) {
        return Optional.ofNullable(queryOne(query));
    }

    @Override
    public TRoleDTO queryFirst(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.queryFirst(query));
    }

    @Override
    public Optional<TRoleDTO> queryFirstOpt(TRoleQuery query) {
        return Optional.ofNullable(queryFirst(query));
    }

    @Override
    public TRoleDTO selectFirst(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.selectFirst(query));
    }

    @Override
    public Optional<TRoleDTO> selectFirstOpt(TRoleQuery query) {
        return Optional.ofNullable(selectFirst(query));
    }

    @Override
    public List<TRoleDTO> queryList(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.queryList(query));
    }

    @Override
    public List<TRoleDTO> selectList(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.selectList(query));
    }

    @Override
    public Stream<TRoleDTO> queryStream(TRoleQuery query) {
        return selectList(query).stream();
    }

    @Override
    public Stream<TRoleDTO> selectStream(TRoleQuery query) {
        return selectList(query).stream();
    }

    @Override
    public List<TRoleDTO> queryTop(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.queryTop(query));
    }

    @Override
    public Stream<TRoleDTO> queryTopStream(TRoleQuery query) {
        return queryTop(query).stream();
    }

    @Override
    public List<TRoleDTO> selectTop(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.selectTop(query));
    }

    @Override
    public Stream<TRoleDTO> selectTopStream(TRoleQuery query) {
        return selectTop(query).stream();
    }

    @Override
    public IPageData<TRoleDTO> selectPage(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.selectPage(query));
    }

    @Override
    public IPageData<TRoleDTO> queryPage(TRoleQuery query) {
        return roleBuilder.buildRole(roleDao.queryPage(query));
    }

    @Override
    public List<TRoleDTO> queryListByUserId(Long userId) {
        return roleBuilder.buildRoleDTO(roleDao.queryListByUserId(userId));
    }
}