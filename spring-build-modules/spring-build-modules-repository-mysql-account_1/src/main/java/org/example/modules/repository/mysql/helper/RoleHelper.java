package org.example.modules.repository.mysql.helper;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.exceptions.ValidateException;
import builder.AccountBuilder;
import builder.RoleBuilder;
import org.example.modules.repository.mysql.dao.*;
import org.example.modules.repository.mysql.entity.vo.RoleFormVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Component
@Transactional
public class RoleHelper {
    @Autowired
    private AccountBuilder accountBuilder;
    @Autowired
    private RoleBuilder roleBuilder;
    @Autowired
    private TUserDao userDao;
    @Autowired
    private TRoleDao roleDao;
    @Autowired
    private TPermissionDao permissionDao;
    @Autowired
    private TUserRoleDao userRoleDao;
    @Autowired
    private TRolePermissionDao rolePermissionDao;

    public void handleRolePermissionUpdate(Long roleId, List<Long> permissionIds, List<String> permissionNames) {
        List<Long> existRoleIds = permissionDao.getPermisionIdsByPermissionIdsOrPermissionNames(permissionIds, permissionNames);
        List<Long> rolePermissionIds = rolePermissionDao.getRoleIdsByRoleId(roleId);
        Collection<Long> intersection = CollUtil.intersection(existRoleIds, rolePermissionIds);
        existRoleIds.removeAll(intersection);
        rolePermissionDao.saveBatch(roleBuilder.createRolePermissions(roleId, existRoleIds));
        rolePermissionIds.removeAll(intersection);
        rolePermissionDao.removeByPermissionIdsAndRoleId(rolePermissionIds, roleId);
    }

    public void validate(RoleFormVo accountFormVo) {
        String roleName = accountFormVo.getRoleName();
        boolean isExist = roleDao.existByRoleName(roleName);
        if (isExist) {
            throw new ValidateException(roleName + "已存在");
        }
    }
}