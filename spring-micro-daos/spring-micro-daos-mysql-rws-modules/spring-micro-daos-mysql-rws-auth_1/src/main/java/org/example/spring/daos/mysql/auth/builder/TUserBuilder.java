package org.example.spring.daos.mysql.auth.builder;

import org.example.spring.daos.mysql.auth.table.po.TUser;
import org.example.spring.daos.mysql.auth.table.vo.TUserVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TUserBuilder {
    TUserBuilder INSTANCE = Mappers.getMapper(TUserBuilder.class);

    TUser builidUser(TUserVo tUserVo);
}
