package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.infrastructures.mysql.auth.entity.vo.AccountVo;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.example.spring.infrastructures.mysql.auth.table.po.TUserRole;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountBuilder extends TUserRoleBuilder, TUserBuilder, TRoleBuilder {

}
