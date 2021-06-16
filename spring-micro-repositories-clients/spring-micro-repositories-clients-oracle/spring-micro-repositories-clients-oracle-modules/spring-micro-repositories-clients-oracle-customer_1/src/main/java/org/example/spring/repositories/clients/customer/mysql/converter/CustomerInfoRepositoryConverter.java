package org.example.spring.repositories.clients.bill.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.query.CustomerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerInfoVo;
import org.example.spring.repositories.mysql.customer.table.dto.TCustomerInfoDTO;
import org.example.spring.repositories.mysql.customer.table.query.TCustomerInfoQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TCustomerInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface CustomerInfoRepositoryConverter {
    CustomerInfoRepositoryConverter CONVERTER = Mappers.getMapper(CustomerInfoRepositoryConverter.class);

    TCustomerInfoVo convertVo(CustomerInfoVo vo);

    TCustomerInfoVo[] convertVo(CustomerInfoVo[] vo);

    List<TCustomerInfoVo> convertVo(List<CustomerInfoVo> vo);

    TCustomerInfoQuery convertQuery(CustomerInfoQuery CustomerInfoQuery);

    CustomerInfoDTO buildDto(TCustomerInfoDTO tCustomerInfoDTO);

    List<CustomerInfoDTO> buildDto(List<TCustomerInfoDTO> listByIds);

    IPageData<CustomerInfoDTO> buildDto(IPageData<TCustomerInfoDTO> queryPage);
}
