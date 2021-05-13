package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.entity.User;
import org.example.spring.daos.mysql.auth.entity.details.UserDetails;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.daos.mysql.auth.table.po.TRole;
import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.po.TUserRole;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface UserClientBuilder {
    TUser build(User user);

    default List<TUserRole> build(List<Long> roleIds, Long userId) {
        ArrayList<TUserRole> list = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            list.add(new TUserRole(userId, roleId));
        }
        return list;
    }

    User build(TUser byId);

    TUserQuery build(UserQuery query);

    List<User> buildList(List<TUser> list);

    IPageData<User> buildPage(IPageData<TUser> list);

    Stream<User> buildStream(Stream<TUser> queryListStream);

    List<UserDetails.Role> buildRoleDetails(List<TRole> listRolesByUserId);

    UserDetails.User buildDetails(TUser byId);
}
