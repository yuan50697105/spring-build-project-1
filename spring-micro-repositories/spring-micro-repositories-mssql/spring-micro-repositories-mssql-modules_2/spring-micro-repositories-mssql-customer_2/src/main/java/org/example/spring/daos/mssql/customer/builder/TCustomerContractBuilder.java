package org.example.spring.daos.mssql.customer.builder;

import org.example.spring.daos.mssql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.daos.mssql.customer.table.po.TCustomerContract;
import org.example.spring.daos.mssql.customer.table.vo.TCustomerContractVo;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface TCustomerContractBuilder {
    TCustomerContractBuilder INSTANCE = Mappers.getMapper(TCustomerContractBuilder.class);

    TCustomerContract toPo(TCustomerContractVo vo);

    void copy(TCustomerContract customerContract, @MappingTarget TCustomerContract tCustomerContract);

    TCustomerContractDTO toDTO(TCustomerContract byId);

    List<TCustomerContractDTO> toDTO(List<TCustomerContract> queryList);

    Stream<TCustomerContractDTO> toDTO(Stream<TCustomerContract> queryListStream);

    IPageData<TCustomerContractDTO> toDTO(IPageData<TCustomerContract> selectPage);
}
