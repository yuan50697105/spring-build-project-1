package org.example.spring.plugins.mybatis.converter;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.BaseQuery;
import org.example.spring.plugins.mybatis.entity.po.IBaseEntity;
import org.example.spring.plugins.mybatis.entity.query.IBaseQuery;

import java.util.List;

public interface ICommonsConverter<T, T2 extends IBaseEntity, Q extends BaseQuery,
        Q2 extends IBaseQuery, VO extends T, DTO extends T> {
    <T2 extends IBaseEntity> T2 buildPo(VO vo);

    <T2 extends IBaseEntity> List<T2> buildPo(VO[] vo);

    <T2 extends IBaseEntity, VO extends T> List<T2> buildPo(List<VO> vo);

    <Q2 extends IBaseQuery> Q2 buildQuery(Q q);

    <DTO extends T> DTO buildDTO(T2 dao);

    <DTO extends T, T2 extends IBaseEntity> List<DTO> buildDTOS(List<T2> listByIds);

    <DTO extends T, T2 extends IBaseEntity> IPageData<DTO> buildDTOS(IPageData<T2> listByIds);
}
