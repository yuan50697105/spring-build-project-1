package org.example.spring.repositories.clients.customer.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.customer.dto.SalesRecordDTO;
import org.example.spring.repositories.commons.entity.customer.query.SalesRecordQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SalesRecordVo;
import org.example.spring.repositories.customer.postgres.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.postgres.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TSalesRecordVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface SalesRecordRepositoryConverter {
    SalesRecordRepositoryConverter CONVERTER = Mappers.getMapper(SalesRecordRepositoryConverter.class);

    TSalesRecordVo convertVo(SalesRecordVo vo);

    TSalesRecordVo[] convertVo(SalesRecordVo[] vo);

    List<TSalesRecordVo> convertVo(List<SalesRecordVo> vo);

    TSalesRecordQuery convertQuery(SalesRecordQuery SalesRecordQuery);

    SalesRecordDTO buildDto(TSalesRecordDTO tSalesRecordDTO);

    List<SalesRecordDTO> buildDto(List<TSalesRecordDTO> listByIds);

    IPageData<SalesRecordDTO> buildDto(IPageData<TSalesRecordDTO> queryPage);
}
