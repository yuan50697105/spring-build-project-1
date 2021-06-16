package org.example.spring.repositories.clients.customer.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerContractDTO;
import org.example.spring.repositories.commons.entity.customer.query.CustomerContractQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerContractVo;
import org.example.spring.repositories.mssql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.repositories.mssql.customer.table.query.TCustomerContractQuery;
import org.example.spring.repositories.mssql.customer.table.vo.TCustomerContractVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface CustomerContractRepositoryConverter {
    CustomerContractRepositoryConverter CONVERTER = Mappers.getMapper(CustomerContractRepositoryConverter.class);

    TCustomerContractVo convertVo(CustomerContractVo vo);

    TCustomerContractVo[] convertVo(CustomerContractVo[] vo);

    List<TCustomerContractVo> convertVo(List<CustomerContractVo> vo);

    TCustomerContractQuery convertQuery(CustomerContractQuery customerContractQuery);

    CustomerContractDTO buildDto(TCustomerContractDTO tCustomerContractDTO);

    List<CustomerContractDTO> buildDto(List<TCustomerContractDTO> listByIds);

    IPageData<CustomerContractDTO> buildDto(IPageData<TCustomerContractDTO> queryPage);
}
