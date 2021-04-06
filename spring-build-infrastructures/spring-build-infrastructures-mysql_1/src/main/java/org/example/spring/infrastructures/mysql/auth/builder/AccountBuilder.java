package org.example.spring.infrastructures.mysql.auth.builder;

import org.example.spring.infrastructures.mysql.auth.entity.query.AccountQuery;
import org.example.spring.infrastructures.mysql.auth.entity.result.Account;
import org.example.spring.infrastructures.mysql.auth.entity.vo.AccountVo;
import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.example.spring.infrastructures.mysql.auth.table.query.TUserQuery;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountBuilder {
    TUser buildUser(AccountVo account);

    void copyUser(AccountVo account, @MappingTarget TUser tUser);

    Account buildAccount(TUser user);

    TUserQuery buildQuery(AccountQuery accountQuery);

    IPageData<Account> buildResults(IPageData<TUser> data);

    List<Account> buildResults(List<TUser> data);

    Account buildResults(TUser data);
}
