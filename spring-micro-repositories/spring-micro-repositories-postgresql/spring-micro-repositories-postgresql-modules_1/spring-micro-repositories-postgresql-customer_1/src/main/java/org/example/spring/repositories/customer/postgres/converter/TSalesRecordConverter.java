package org.example.spring.repositories.customer.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.mybatis.converter.IBaseConverter;
import org.example.spring.repositories.customer.postgres.table.dto.TSalesRecordDTO;
import org.example.spring.repositories.customer.postgres.table.po.TSalesRecord;
import org.example.spring.repositories.customer.postgres.table.query.TSalesRecordQuery;
import org.example.spring.repositories.customer.postgres.table.vo.TSalesRecordVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseBuilder.class)
public interface TSalesRecordConverter extends IBaseConverter<TSalesRecord, TSalesRecordDTO, TSalesRecordVo, TSalesRecordQuery> {
    TSalesRecordConverter CONVERTER = Mappers.getMapper(TSalesRecordConverter.class);
}
