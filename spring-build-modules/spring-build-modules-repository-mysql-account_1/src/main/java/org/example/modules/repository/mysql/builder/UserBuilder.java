package org.example.modules.repository.mysql.builder;

import org.example.modules.repository.mysql.entity.po.TRole;
import org.example.modules.repository.mysql.entity.po.TUser;
import org.example.modules.repository.mysql.entity.po.TUserRole;
import org.example.modules.repository.mysql.entity.query.AccountQuery;
import org.example.modules.repository.mysql.entity.query.TUserQuery;
import org.example.modules.repository.mysql.entity.vo.AccountDetailVo;
import org.example.modules.repository.mysql.entity.vo.AccountFormVo;
import org.example.modules.repository.mysql.entity.vo.AccountVo;
import org.example.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface UserBuilder {
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
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

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateId", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    TUserRole generateUserRole(Long userId, Long roleId);

    AccountDetailVo.UserInfo generateUserInfo(TUser user);

    Set<AccountDetailVo.RoleInfo> generateUserRoleInfos(List<TRole> listByUserId);

    TUserQuery generateUserQuery(AccountQuery accountQuery);

    IPageData<AccountVo> generateAccountVoPage(IPageData<TUser> data);

    AccountVo generateAccountVo(TUser user);
}
