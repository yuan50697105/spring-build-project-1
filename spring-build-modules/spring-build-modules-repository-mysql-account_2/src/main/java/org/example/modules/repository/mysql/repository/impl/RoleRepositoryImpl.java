package org.example.modules.repository.mysql.repository.impl;

import org.example.modules.repository.mysql.builder.RoleBuilder;
import org.example.modules.repository.mysql.dao.TPermissionDao;
import org.example.modules.repository.mysql.dao.TRoleDao;
import org.example.modules.repository.mysql.dao.TRolePermissionDao;
import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.query.RoleQuery;
import org.example.modules.repository.mysql.entity.vo.RoleDetailVo;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.example.modules.repository.mysql.entity.vo.RoleVo;
import org.example.modules.repository.mysql.repository.RoleRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.example.plugins.mybatis.repository.impl.IBaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RoleRepositoryImpl extends IBaseRepositoryImpl<RoleVo, RoleFormVo, RoleDetailVo, RoleQuery> implements RoleRepository {
    @Autowired
    private RoleBuilder roleBuilder;
    @Autowired
    private TRoleDao roleDao;
    @Autowired
    private TPermissionDao permissionDao;
    @Autowired
    private TRolePermissionDao rolePermissionDao;

    @Override
    public void save(RoleFormVo roleFormVo) {
        TRole role = roleBuilder.createRole(roleFormVo.getRole());
        roleDao.save(role);
        List<Long> existPermissionIds = permissionDao.getPermisionIdsByPermissionIdsOrPermissionNames(roleFormVo.getPermissionIds(), roleFormVo.getPermissionNames());
    }

    @Override
    public void update(RoleFormVo roleFormVo) {

    }

    @Override
    public void update(Long id, RoleFormVo formVo) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public RoleDetailVo getById(Long id) {
        return null;
    }

    @Override
    public IPageData<RoleVo> queryPage(RoleQuery roleQuery) {
        return null;
    }

    @Override
    public Iterable<RoleVo> queryList(RoleQuery roleQuery) {
        return null;
    }

    @Override
    public RoleVo queryOne(RoleQuery roleQuery) {
        return null;
    }
}