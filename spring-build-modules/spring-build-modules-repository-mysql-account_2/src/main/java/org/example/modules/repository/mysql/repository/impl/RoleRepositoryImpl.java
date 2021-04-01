package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.RoleBuilder;
import org.example.modules.repository.mysql.dao.TPermissionDao;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TRolePermissionDao;
import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.query.TRoleQuery;
import org.example.modules.repository.mysql.entity.result.Role;
import org.example.modules.repository.mysql.entity.result.RoleDetails;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.modules.repository.mysql.helper.RoleHelper;
import org.example.modules.repository.mysql.repository.RoleRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
@Cacheable(cacheNames = {"roles"}, sync = true)
public class RoleRepositoryImpl extends IBaseRepositoryImpl<Role, RoleFormVo, RoleDetails, RoleQuery> implements RoleRepository {
    @Autowired
    private RoleBuilder roleBuilder;
    @Autowired
    private RoleHelper roleHelper;
    @Autowired
    private TRoleDao roleDao;
    @Autowired
    private TPermissionDao permissionDao;
    @Autowired
    private TRolePermissionDao rolePermissionDao;

    @Override
    @Caching(put = {
            @CachePut(key = "roleFormVo.id"),
            @CachePut(key = "roleFormVo.roleName")
    })
    public void save(@Validated RoleFormVo roleFormVo) {
        saveWithId(roleFormVo);
    }

    @Override
    @Caching(put = {
            @CachePut(key = "roleFormVo.id"),
            @CachePut(key = "roleFormVo.roleName")
    })
    public Long saveWithId(RoleFormVo roleFormVo) {
        roleHelper.validate(roleFormVo);
        TRole role = roleBuilder.createRole(roleFormVo.getRole());
        roleDao.save(role);
        List<Long> existPermissionIds = permissionDao.getPermisionIdsByPermissionIdsOrPermissionNames(roleFormVo.getPermissionIds(), roleFormVo.getPermissionNames());
        rolePermissionDao.saveBatch(roleBuilder.createRolePermissions(role.getId(), existPermissionIds));
        return role.getId();
    }

    @Override
    @Caching(put = {
            @CachePut(key = "formVo.id"),
            @CachePut(key = "formVo.roleName")
    })
    public void update(@Validated RoleFormVo formVo) {
        Optional<TRole> optional = roleDao.getByIdOpt(formVo.getId());
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            roleBuilder.copyRole(formVo.getRole(), tRole);
            roleHelper.handleRolePermissionUpdate(tRole.getId(), formVo.getPermissionIds(), formVo.getPermissionNames());
        }
        ;
    }

    @Override
    @CacheEvict(key = "#ids")
    public void delete(List<Long> ids) {
        roleDao.removeByIds(ids);
        rolePermissionDao.removeByRoleIds(ids);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "id"),
            @Cacheable(key = "result.role.name", unless = "result.role.name != null ")
    })
    public RoleDetails getById(Long id) {
        Optional<TRole> optional = roleDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            RoleDetails roleDetails = new RoleDetails();
            roleDetails.setId(tRole.getId());
            roleDetails.setRole(roleBuilder.createRole(tRole));
            roleDetails.setPermissions(roleBuilder.createRolePermissionsInfo(rolePermissionDao.getRolePermissionsByRoleId(id)));
            return roleDetails;
        } else {
            return null;
        }
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "roleQuery.id"),
            @Cacheable(key = "roleQuery.name", unless = "roleQuery.name != null ")
    })
    public IPageData<Role> queryPage(RoleQuery roleQuery) {
        TRoleQuery query = roleBuilder.createQuery(roleQuery);
        IPageData<TRole> roles = roleDao.queryPage(query);
        return roleBuilder.createRole(roles);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "roleQuery.id"),
            @Cacheable(key = "roleQuery.name", unless = "roleQuery.name != null ")
    })
    public List<Role> queryList(RoleQuery roleQuery) {
        TRoleQuery query = roleBuilder.createQuery(roleQuery);
        List<TRole> roles = roleDao.queryList(query);
        return roleBuilder.createRole(roles);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "roleQuery.id"),
            @Cacheable(key = "roleQuery.name", unless = "roleQuery.name != null ")
    })
    public Role queryOne(RoleQuery roleQuery) {
        TRoleQuery query = roleBuilder.createQuery(roleQuery);
        TRole role = roleDao.queryOne(query);
        return roleBuilder.createRole(role);
    }
}