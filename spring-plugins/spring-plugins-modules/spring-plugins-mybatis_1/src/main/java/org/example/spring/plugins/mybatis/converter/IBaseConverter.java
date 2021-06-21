package org.example.spring.plugins.mybatis.converter;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.plugins.commons.entity.query.BaseQuery;

import java.util.List;

public interface IBaseConverter<T, DTO extends T, VO extends T, Q extends BaseQuery> {
    T buildPo(VO vo);

    List<T> buildPo(List<VO> vo);

    DTO buildDTO(T byId);

    List<DTO> buildDTOS(List<T> queryList);

    IPageData<DTO> buildDTOS(IPageData<T> queryPage);
}