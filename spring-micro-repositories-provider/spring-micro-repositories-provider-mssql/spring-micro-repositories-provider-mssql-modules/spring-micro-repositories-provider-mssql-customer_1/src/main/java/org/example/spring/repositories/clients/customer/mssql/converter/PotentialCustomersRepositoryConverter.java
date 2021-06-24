package org.example.spring.repositories.clients.customer.mssql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.customer.dto.PotentialCustomersDTO;
import org.example.spring.repositories.commons.entity.customer.query.PotentialCustomersQuery;
import org.example.spring.repositories.commons.entity.customer.vo.PotentialCustomersVo;
import org.example.spring.repositories.customer.mssql.table.dto.TPotentialCustomersDTO;
import org.example.spring.repositories.customer.mssql.table.query.TPotentialCustomersQuery;
import org.example.spring.repositories.customer.mssql.table.vo.TPotentialCustomersVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface PotentialCustomersRepositoryConverter {
    PotentialCustomersRepositoryConverter CONVERTER = Mappers.getMapper(PotentialCustomersRepositoryConverter.class);

    TPotentialCustomersVo convertVo(PotentialCustomersVo vo);

    TPotentialCustomersVo[] convertVo(PotentialCustomersVo[] vo);

    List<TPotentialCustomersVo> convertVo(List<PotentialCustomersVo> vo);

    TPotentialCustomersQuery convertQuery(PotentialCustomersQuery PotentialCustomersQuery);

    PotentialCustomersDTO buildDto(TPotentialCustomersDTO tPotentialCustomersDTO);

    List<PotentialCustomersDTO> buildDto(List<TPotentialCustomersDTO> listByIds);

    IPageData<PotentialCustomersDTO> buildDto(IPageData<TPotentialCustomersDTO> queryPage);
}
