package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.entity.dto.UserDTO;
import org.example.spring.daos.mysql.auth.entity.dto.UserRoleDTO;
import org.example.spring.daos.mysql.auth.entity.query.UserQuery;
import org.example.spring.daos.mysql.auth.entity.vo.UserVo;
import org.example.spring.daos.mysql.auth.table.dto.TUserDTO;
import org.example.spring.daos.mysql.auth.table.dto.TUserRoleDTO;
import org.example.spring.daos.mysql.auth.table.query.TUserQuery;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface UserClientBuilder {

    UserDTO build(TUserDTO byId);

    TUserQuery build(UserQuery query);

    TUserVo buildVO(UserVo userVo);

    UserRoleDTO buildUserDetails(TUserRoleDTO details);

    List<UserDTO> build(List<TUserDTO> queryList);

    IPageData<UserDTO> build(IPageData<TUserDTO> queryPage);
}
