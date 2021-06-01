package org.example.spring.repositories.postgres.bill.builder;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.postgres.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.postgres.bill.table.po.TBillLog;
import org.example.spring.repositories.postgres.bill.table.vo.TBillLogVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface TBillLogBuilder {
    TBillLogBuilder INSTANCE = Mappers.getMapper(TBillLogBuilder.class);

    TBillLog build(TBillLogVo vo);

    TBillLogDTO build(TBillLog byId);

    List<TBillLogDTO> build(List<TBillLog> queryList);

    IPageData<TBillLogDTO> build(IPageData<TBillLog> selectPage);
}
