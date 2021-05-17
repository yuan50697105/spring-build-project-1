package org.example.spring.daos.mysql.items.builder;

import org.example.spring.daos.mysql.items.table.dto.TCheckItemDTO;
import org.example.spring.daos.mysql.items.table.po.TCheckItem;
import org.example.spring.daos.mysql.items.table.vo.TCheckItemVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TCheckItemBuilder {
    TCheckItemBuilder INSTANCE = Mappers.getMapper(TCheckItemBuilder.class);

    TCheckItem build(TCheckItemVo vo);

    void copy(TCheckItem checkItem, @MappingTarget TCheckItem tCheckItem);

    TCheckItemDTO build(TCheckItem checkItem);

    List<TCheckItemDTO> build(List<TCheckItem> queryList);

    IPageData<TCheckItemDTO> build(IPageData<TCheckItem> queryPage);

}