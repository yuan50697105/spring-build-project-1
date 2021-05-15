package org.example.spring.daos.mysql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.builder.TRoleBuilder;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.po.TRoleResource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TRoleVo extends TRole implements Serializable {
    private List<Long> resourceIds;

    public TRole toRole() {
        return TRoleBuilder.INSTANCE.buildRole(this);
    }

    public List<TRoleResource> toResource(Long roleId) {
        ArrayList<TRoleResource> tRoleResources = new ArrayList<>(resourceIds.size());
        for (Long resourceId : resourceIds) {
            tRoleResources.add(new TRoleResource(roleId, resourceId));
        }
        return tRoleResources;
    }
}