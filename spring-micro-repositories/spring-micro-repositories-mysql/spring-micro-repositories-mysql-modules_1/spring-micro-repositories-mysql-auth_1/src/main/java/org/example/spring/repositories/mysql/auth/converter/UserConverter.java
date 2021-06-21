package org.example.spring.repositories.mysql.auth.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.ICommonsConverter;
import org.example.spring.repositories.commons.entity.auth.dto.UserDTO;
import org.example.spring.repositories.commons.entity.auth.po.User;
import org.example.spring.repositories.commons.entity.auth.query.UserQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;
import org.mapstruct.Mapper;

@Mapper(config = BaseBuilder.class)
public interface UserConverter extends ICommonsConverter<User, UserDTO, UserVo, UserQuery> {
}
