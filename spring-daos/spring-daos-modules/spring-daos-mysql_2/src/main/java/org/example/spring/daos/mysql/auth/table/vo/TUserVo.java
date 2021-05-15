package org.example.spring.daos.mysql.auth.table.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.spring.daos.mysql.auth.builder.TUserBuilder;
import org.example.spring.daos.mysql.auth.builder.TUserRoleBuilder;
import org.example.spring.daos.mysql.auth.table.enumerate.TUserStatus;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.po.TUserRole;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TUserVo extends TUser implements Serializable {
    private List<Long> roleIds;

    @Override
    public String getStatus() {
        return TUserStatus.getValue(super.getStatus());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(TUserStatus.getValue(status));
    }

    public List<TUserRole> toRole(Long userId) {
        TUserRoleBuilder instance = TUserRoleBuilder.INSTANCE;
        return instance.buildRoles(userId, roleIds);
    }

    public TUser toUser() {
        return TUserBuilder.INSTANCE.builidUser(this);
    }
}