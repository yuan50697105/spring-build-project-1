package org.example.spring.infrastructures.es.auth.builder;

import org.example.spring.infrastructures.es.auth.entity.po.ERoleResource;
import org.example.spring.infrastructures.es.auth.entity.po.EUserRole;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface AuthBuilder {
    default List<EUserRole> buildRoles(Long id, List<Long> existRoleIds) {
        if (existRoleIds != null) {
            ArrayList<EUserRole> list = new ArrayList<>(existRoleIds.size());
            Iterator<Long> iterator = existRoleIds.iterator();
            while (iterator.hasNext()) {
                list.add(buildRole(id, iterator.next()));
            }
            return list;
        } else {
            return null;
        }
    }

    EUserRole buildRole(Long userId, Long roleId);

    default List<ERoleResource> buildRoleResources(Long roleId, List<Long> permissionIds) {
        if (permissionIds != null) {
            ArrayList<ERoleResource> list = new ArrayList<>(permissionIds.size());
            Iterator<Long> iterator = permissionIds.iterator();
            while (iterator.hasNext()) {
                list.add(buildRoleResource(roleId, iterator.next()));
            }
            return list;
        } else {
            return null;
        }
    }

    ERoleResource buildRoleResource(Long roleId, Long resourceId);
}
