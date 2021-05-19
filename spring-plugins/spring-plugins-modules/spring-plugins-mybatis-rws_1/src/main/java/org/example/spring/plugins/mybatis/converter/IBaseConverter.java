package org.example.spring.plugins.mybatis.converter;

import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;

public interface IBaseConverter<T, DTO, VO, Q> {
    T buildPo(VO vo);

    void copy(VO vo, T t);

    DTO buildDTO(T byId);

    List<DTO> buildDTOS(List<T> queryList);

    IPageData<DTO> buildDTOS(IPageData<T> queryPage);
}