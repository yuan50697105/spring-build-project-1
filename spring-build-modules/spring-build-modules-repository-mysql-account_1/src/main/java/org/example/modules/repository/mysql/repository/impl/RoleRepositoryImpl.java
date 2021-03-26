package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.RoleBuilder;
import org.example.modules.repository.mysql.cache.CacheConfiguration;
import org.example.modules.repository.mysql.dao.TPermissionDao;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TRolePermissionDao;
import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.query.TRoleQuery;
import org.example.modules.repository.mysql.entity.vo.RoleDetailVo;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.modules.repository.mysql.entity.vo.RoleVo;
import org.example.modules.repository.mysql.helper.RoleHelper;
import org.example.modules.repository.mysql.repository.RoleRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
@CacheConfig(cacheNames = {"roles"}, cacheManager = CacheConfiguration.ROLE_CACHE_MANAGER)
public class RoleRepositoryImpl extends IBaseRepositoryImpl<RoleVo, RoleFormVo, RoleDetailVo, RoleQuery> implements RoleRepository {
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
        roleHelper.validate(roleFormVo);
        TRole role = roleBuilder.createRole(roleFormVo.getRole());
        roleDao.save(role);
        List<Long> existPermissionIds = permissionDao.getPermisionIdsByPermissionIdsOrPermissionNames(roleFormVo.getPermissionIds(), roleFormVo.getPermissionNames());
        rolePermissionDao.saveBatch(roleBuilder.createRolePermissions(role.getId(), existPermissionIds));
    }

    @Override
    @Caching(put = {
            @CachePut(key = "roleFormVo.id"),
            @CachePut(key = "roleFormVo.roleName")
    })
    public void update(@Validated RoleFormVo roleFormVo) {
        update(roleFormVo.getId(), roleFormVo);
    }

    @Override
    @Caching(put = {
            @CachePut(key = "id"),
            @CachePut(key = "formVo.roleName")
    })
    public void update(@NotEmpty Long id, @Validated RoleFormVo formVo) {
        Optional<TRole> optional = roleDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            roleBuilder.copyRole(formVo.getRole(), tRole);
            roleHelper.handleRolePermissionUpdate(tRole.getId(), formVo.getPermissionIds(), formVo.getPermissionNames());
        }
    }

    @Override
    @CacheEvict(key = "ids")
    public void delete(List<Long> ids) {
        roleDao.removeByIds(ids);
        rolePermissionDao.removeByRoleIds(ids);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "id"),
            @Cacheable(key = "result.role.name", unless = "result.role.name != null ")
    })
    public RoleDetailVo getById(Long id) {
        Optional<TRole> optional = roleDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            RoleDetailVo roleDetailVo = new RoleDetailVo();
            roleDetailVo.setId(tRole.getId());
            roleDetailVo.setRole(roleBuilder.createRoleInfo(tRole));
            roleDetailVo.setPermissions(roleBuilder.createRolePermissionsInfo(rolePermissionDao.getRolePermissionsByRoleId(id)));
            return roleDetailVo;
        } else {
            return null;
        }
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "roleQuery.id"),
            @Cacheable(key = "roleQuery.name", unless = "roleQuery.name != null ")
    })
    public IPageData<RoleVo> queryPage(RoleQuery roleQuery) {
        TRoleQuery query = roleBuilder.createQuery(roleQuery);
        IPageData<TRole> roles = roleDao.queryPage(query);
        return roleBuilder.createRoleVos(roles);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "roleQuery.id"),
            @Cacheable(key = "roleQuery.name", unless = "roleQuery.name != null ")
    })
    public List<RoleVo> queryList(RoleQuery roleQuery) {
        TRoleQuery query = roleBuilder.createQuery(roleQuery);
        List<TRole> roles = roleDao.queryList(query);
        return roleBuilder.createRoleVos(roles);
    }

    @Override
    @Caching(cacheable = {
            @Cacheable(key = "roleQuery.id"),
            @Cacheable(key = "roleQuery.name", unless = "roleQuery.name != null ")
    })
    public RoleVo queryOne(RoleQuery roleQuery) {
        TRoleQuery query = roleBuilder.createQuery(roleQuery);
        TRole role = roleDao.queryOne(query);
        return roleBuilder.createRoleVo(role);
    }
}