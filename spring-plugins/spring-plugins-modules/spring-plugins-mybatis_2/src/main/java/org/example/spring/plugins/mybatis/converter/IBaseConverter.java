package org.example.spring.plugins.mybatis.converter;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.mybatis.entity.query.IBaseQuery;
import org.mapstruct.MappingTarget;

import java.util.List;

public interface IBaseConverter<T, DTO extends T, VO extends T, Q extends IBaseQuery> {
    T buildPo(VO vo);

    void copy(VO vo, @MappingTarget T t);

    DTO buildDTO(T byId);

    List<DTO> buildDTOS(List<T> queryList);

    IPageData<DTO> buildDTOS(IPageData<T> queryPage);
}