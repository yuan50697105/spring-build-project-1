package org.example.spring.infrastructures.mysql.auth.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.auth.builder.AuthBuilder;
import org.example.spring.infrastructures.mysql.auth.dao.TPermissionDao;
import org.example.spring.infrastructures.mysql.auth.dao.TRolePermissionDao;
import org.example.spring.infrastructures.mysql.auth.entity.query.PermissionQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Permission;
import org.example.spring.infrastructures.mysql.auth.entity.result.PermissionDetails;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionFormVo;
import org.example.spring.infrastructures.mysql.auth.entity.vo.PermissionVo;
import org.example.spring.infrastructures.mysql.auth.repository.PermissionRepository;
import org.example.spring.infrastructures.mysql.auth.table.po.TPermission;
import org.example.spring.infrastructures.mysql.auth.table.query.TPermissionQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
@Transactional
public class PermissionRepositoryImpl extends IBaseRepositoryImpl<Permission, PermissionFormVo, PermissionDetails, PermissionQuery> implements PermissionRepository {
    private final TPermissionDao permissionDao;
    private final TRolePermissionDao rolePermissionDao;
    private final AuthBuilder authBuilder;

    @Override
    public Long saveWithId(PermissionFormVo permissionFormVo) {
        PermissionVo permission = permissionFormVo.getPermission();
        TPermission entity = authBuilder.buildPermission(permission);
        permissionDao.save(entity);
        return entity.getId();
    }

    @Override
    public void update(PermissionFormVo permissionFormVo) {
        Long id = permissionFormVo.getId();
        PermissionVo permission = permissionFormVo.getPermission();
        Optional<TPermission> optional = permissionDao.getByIdOpt(id);
        if (optional.isPresent()) {
            TPermission tPermission = optional.get();
            authBuilder.copyPermission(permission, tPermission);
            permissionDao.updateById(tPermission);
        }
    }

    @Override
    public void delete(List<Long> ids) {
        permissionDao.removeByIds(ids);
        rolePermissionDao.removeByPermissionIds(ids);
    }

    @Override
    public PermissionDetails getById(Long id) {
        PermissionDetails details = new PermissionDetails();
        details.setPermission(authBuilder.buildPermissionResult(permissionDao.getById(id)));
        return details;
    }

    @Override
    public IPageData<Permission> queryPage(PermissionQuery permissionQuery) {
        TPermissionQuery query = authBuilder.buildPermissionQuery(permissionQuery);
        IPageData<TPermission> data = permissionDao.queryPage(query);
        return authBuilder.buildPermissionResult(data);
    }

    @Override
    public List<Permission> queryList(PermissionQuery permissionQuery) {
        TPermissionQuery query = authBuilder.buildPermissionQuery(permissionQuery);
        List<TPermission> data = permissionDao.queryList(query);
        return authBuilder.buildPermissionResult(data);
    }

    @Override
    public Permission queryOne(PermissionQuery permissionQuery) {
        TPermissionQuery query = authBuilder.buildPermissionQuery(permissionQuery);
        TPermission data = permissionDao.queryOne(query);
        return authBuilder.buildPermissionResult(data);
    }

}