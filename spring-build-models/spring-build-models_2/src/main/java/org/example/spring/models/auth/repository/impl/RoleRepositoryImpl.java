package org.example.spring.models.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.models.auth.builder.AuthModelBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TResourceDao;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleDao;
import org.example.spring.infrastructures.mysql.auth.dao.TRoleResourceDao;
import org.example.spring.models.auth.entity.query.RoleQuery;
import org.example.spring.models.auth.entity.result.Role;
import org.example.spring.models.auth.entity.result.RoleDetails;
import org.example.spring.models.auth.entity.vo.RoleFormVo;
import org.example.spring.models.auth.entity.vo.RoleVo;
import org.example.spring.models.auth.repository.RoleRepository;
import org.example.spring.infrastructures.mysql.auth.table.po.TRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TRoleQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class RoleRepositoryImpl extends IBaseRepositoryImpl<Role, RoleFormVo, RoleDetails, RoleQuery> implements RoleRepository {
    private final AuthModelBuilder authModelBuilder;
    private final TRoleDao roleDao;
    private final TResourceDao permissionDao;
    private final TRoleResourceDao rolePermissionDao;

    @Override
    public void save(RoleFormVo roleFormVo) {
        saveWithId(roleFormVo);
    }

    @Override
    public Long saveWithId(RoleFormVo roleFormVo) {
        RoleVo role = roleFormVo.getRole();
        List<Long> permissionIds = roleFormVo.getPermissionIds();
        List<String> permissionName = roleFormVo.getPermissionName();
        TRole entity = authModelBuilder.buildRole(role);
        roleDao.save(entity);
        permissionIds = permissionDao.listPermissionIdsByPermissionIdsOrPermissionName(permissionIds, permissionName);
        rolePermissionDao.saveNew(entity.getId(), permissionIds);
        return entity.getId();
    }

    @Override
    public void update(RoleFormVo roleFormVo) {
        Long id = roleFormVo.getId();
        RoleVo role = roleFormVo.getRole();
        List<Long> permissionIds = roleFormVo.getPermissionIds();
        List<String> permissionName = roleFormVo.getPermissionName();
        Optional<TRole> optional = roleDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            authModelBuilder.copyRole(role, tRole);
            roleDao.updateById(tRole);
            permissionIds = permissionDao.listPermissionIdsByPermissionIdsOrPermissionName(permissionIds, permissionName);
            rolePermissionDao.saveUpdate(id, permissionIds);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        roleDao.removeByIds(ids);
        rolePermissionDao.removeByRoleIds(ids);
    }

    @Override
    public Role getById(Long id) {
        return authModelBuilder.buildRoleResult(roleDao.getById(id));
    }

    @Override
    public RoleDetails getDetailsById(Long id) {
        RoleDetails details = new RoleDetails();
        details.setRole(authModelBuilder.buildRoleResult(roleDao.getById(id)));
        details.setResources(authModelBuilder.buildResourceResult(rolePermissionDao.listByRoleId(id)));
        return details;
    }

    @Override
    public IPageData<Role> queryPage(RoleQuery roleQuery) {
        TRoleQuery query = authModelBuilder.buildRoleQuery(roleQuery);
        IPageData<TRole> role = roleDao.queryPage(query);
        return authModelBuilder.buildRoleResult(role);
    }

    @Override
    public List<Role> queryList(RoleQuery roleQuery) {
        TRoleQuery query = authModelBuilder.buildRoleQuery(roleQuery);
        List<TRole> role = roleDao.queryList(query);
        return authModelBuilder.buildRoleResult(role);
    }

    @Override
    public Role queryOne(RoleQuery roleQuery) {
        TRoleQuery query = authModelBuilder.buildRoleQuery(roleQuery);
        TRole role = roleDao.queryOne(query);
        return authModelBuilder.buildRoleResult(role);
    }
}