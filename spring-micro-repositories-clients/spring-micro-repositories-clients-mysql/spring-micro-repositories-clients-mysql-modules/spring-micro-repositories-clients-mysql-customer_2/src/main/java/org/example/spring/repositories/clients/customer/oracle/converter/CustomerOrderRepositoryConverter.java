package org.example.spring.repositories.clients.customer.oracle.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.customer.dto.CustomerOrderDTO;
import org.example.spring.repositories.commons.entity.customer.query.CustomerOrderQuery;
import org.example.spring.repositories.commons.entity.customer.vo.CustomerOrderVo;
import org.example.spring.repositories.oracle.customer.table.dto.TCustomerOrderDTO;
import org.example.spring.repositories.oracle.customer.table.query.TCustomerOrderQuery;
import org.example.spring.repositories.oracle.customer.table.vo.TCustomerOrderVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface CustomerOrderRepositoryConverter {
    CustomerOrderRepositoryConverter CONVERTER = Mappers.getMapper(CustomerOrderRepositoryConverter.class);

    TCustomerOrderVo convertVo(CustomerOrderVo vo);

    TCustomerOrderVo[] convertVo(CustomerOrderVo[] vo);

    List<TCustomerOrderVo> convertVo(List<CustomerOrderVo> vo);

    TCustomerOrderQuery convertQuery(CustomerOrderQuery CustomerOrderQuery);

    CustomerOrderDTO buildDto(TCustomerOrderDTO tCustomerOrderDTO);

    List<CustomerOrderDTO> buildDto(List<TCustomerOrderDTO> listByIds);

    IPageData<CustomerOrderDTO> buildDto(IPageData<TCustomerOrderDTO> queryPage);
}
