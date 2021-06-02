package org.example.spring.repositories.oracle.customer.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.oracle.customer.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.oracle.customer.table.po.TSalesRecord;
import org.example.spring.repositories.oracle.customer.table.query.TSalesRecordQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TSalesRecordVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TSalesRecordConverter extends IBaseConverter<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
    TSalesRecordConverter CONVERTER = Mappers.getMapper(TSalesRecordConverter.class);
}
