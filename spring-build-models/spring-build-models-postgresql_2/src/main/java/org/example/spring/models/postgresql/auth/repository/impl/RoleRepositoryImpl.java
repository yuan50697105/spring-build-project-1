package org.example.spring.models.postgresql.auth.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import org.example.spring.models.postgresql.auth.builder.AuthModelBuilder;
import org.example.spring.infrastructures.postgresql.auth.dao.TResourceDao;
import org.example.spring.infrastructures.postgresql.auth.dao.TRoleDao;
import org.example.spring.infrastructures.postgresql.auth.dao.TRoleResourceDao;
import org.example.spring.models.postgresql.auth.entity.query.RoleQuery;
import org.example.spring.models.postgresql.auth.entity.result.Role;
import org.example.spring.models.postgresql.auth.entity.result.RoleDetails;
import org.example.spring.models.postgresql.auth.entity.vo.RoleModelVo;
import org.example.spring.models.postgresql.auth.repository.RoleRepository;
import org.example.spring.infrastructures.postgresql.auth.table.po.TRole;
import org.example.spring.infrastructures.postgresql.auth.table.query.TRoleQuery;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.models.commons.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadPoolExecutor;

@Repository
@AllArgsConstructor
@Transactional
public class RoleRepositoryImpl extends IBaseRepositoryImpl<Role, RoleModelVo, RoleDetails, RoleQuery> implements RoleRepository {
    private final AuthModelBuilder authModelBuilder;
    private final TRoleDao roleDao;
    private final TResourceDao permissionDao;
    private final TRoleResourceDao rolePermissionDao;
    private final ThreadPoolExecutor executor;
    @Override
    public void save(RoleModelVo roleModelVo) {
        saveWithId(roleModelVo);
    }

    @Override
    public Long saveWithId(RoleModelVo roleModelVo) {
        final TRole role = roleModelVo.getRole();
        final List<Long> resourceIds = roleModelVo.getResourceIds();
        roleDao.save(role);
        if (ObjectUtil.isNotEmpty(roleModelVo.getResourceIds())) {
            executor.execute(() -> saveResource(resourceIds, role.getId()));
        }
        return role.getId();
    }

    private void saveResource(List<Long> resourceIds, Long roleId) {
        resourceIds = permissionDao.listResourceIdsByResourceIds(resourceIds);
        rolePermissionDao.saveNew(roleId, resourceIds);
    }

    @Override
    public void update(RoleModelVo roleModelVo) {
        Long id = roleModelVo.getId();
        TRole role = roleModelVo.getRole();
        List<Long> resourceIds = roleModelVo.getResourceIds();
        Optional<TRole> optional = roleDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TRole tRole = optional.get();
            authModelBuilder.copyRole(role, tRole);
            roleDao.updateById(tRole);
            if (ObjectUtil.isNotEmpty(resourceIds)) {
                executor.submit(() -> saveResource(resourceIds, tRole.getId()));
            }
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