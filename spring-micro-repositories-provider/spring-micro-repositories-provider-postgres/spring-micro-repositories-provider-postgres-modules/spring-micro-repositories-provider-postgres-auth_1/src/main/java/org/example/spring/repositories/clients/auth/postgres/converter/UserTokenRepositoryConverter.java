package org.example.spring.repositories.clients.auth.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.auth.postgres.table.dto.TUserTokenDto;
import org.example.spring.repositories.auth.postgres.table.query.TUserTokenQuery;
import org.example.spring.repositories.auth.postgres.table.vo.TUserTokenVo;
import org.example.spring.repositories.commons.entity.auth.dto.UserTokenDto;
import org.example.spring.repositories.commons.entity.auth.query.UserTokenQuery;
import org.example.spring.repositories.commons.entity.auth.vo.UserTokenVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface UserTokenRepositoryConverter {
    UserTokenRepositoryConverter CONVERTER = Mappers.getMapper(UserTokenRepositoryConverter.class);

    TUserTokenVo buildVo(UserTokenVo vo);

    UserTokenDto buildDto(TUserTokenDto tUserTokenDto);

    TUserTokenQuery buildQuery(UserTokenQuery query);

    List<UserTokenDto> buildDto(List<TUserTokenDto> tUserTokenDto);

    IPageData<UserTokenDto> buildDto(IPageData<TUserTokenDto> dtos);

    List<TUserTokenVo> buildVo(List<UserTokenVo> vo);

}
