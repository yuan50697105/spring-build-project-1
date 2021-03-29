package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TPermission;
import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.po.TUserRole;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.modules.repository.mysql.entity.result.Permission;
import org.example.modules.repository.mysql.entity.result.Role;
import org.example.modules.repository.mysql.entity.result.User;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.entity.result.Account;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface AccountBuilder {

    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TUser generateUser(AccountFormVo.UserInfo account);

    default List<TUserRole> generateUserRoles(Long userId, List<Long> roleIds) {
        ArrayList<TUserRole> tUserRoles = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            tUserRoles.add(generateUserRole(userId, roleId));
        }
        return tUserRoles;
    }


    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TUserRole generateUserRole(Long userId, Long roleId);

    User generateUserInfo(TUser user);

    Set<Role> generateUserRoleInfos(List<TRole> listByUserId);

    TUserQuery generateUserQuery(AccountQuery accountQuery);

    IPageData<Account> generateAccountVoPage(IPageData<TUser> data);


    Account generateAccountVo(TUser user);


    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    void copyUser(AccountFormVo.UserInfo user, @MappingTarget TUser tUser);

    List<Account> generateAccountVoList(List<TUser> tUsers);

    Set<Permission> generateUserPermissionInfos(List<TPermission> permissions);
}
