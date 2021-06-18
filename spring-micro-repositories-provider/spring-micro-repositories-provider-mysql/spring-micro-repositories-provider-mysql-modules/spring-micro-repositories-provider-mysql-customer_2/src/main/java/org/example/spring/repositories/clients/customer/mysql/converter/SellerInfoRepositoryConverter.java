package org.example.spring.repositories.clients.customer.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.customer.dto.SellerInfoDTO;
import org.example.spring.repositories.commons.entity.customer.query.SellerInfoQuery;
import org.example.spring.repositories.commons.entity.customer.vo.SellerInfoVo;
import org.example.spring.repositories.mysql.customer.table.dto.TSellerInfoDTO;
import org.example.spring.repositories.mysql.customer.table.query.TSellerInfoQuery;
import org.example.spring.repositories.mysql.customer.table.vo.TSellerInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface SellerInfoRepositoryConverter {
    SellerInfoRepositoryConverter CONVERTER = Mappers.getMapper(SellerInfoRepositoryConverter.class);

    TSellerInfoVo convertVo(SellerInfoVo vo);

    TSellerInfoVo[] convertVo(SellerInfoVo[] vo);

    List<TSellerInfoVo> convertVo(List<SellerInfoVo> vo);

    TSellerInfoQuery convertQuery(SellerInfoQuery SellerInfoQuery);

    SellerInfoDTO buildDto(TSellerInfoDTO tSellerInfoDTO);

    List<SellerInfoDTO> buildDto(List<TSellerInfoDTO> listByIds);

    IPageData<SellerInfoDTO> buildDto(IPageData<TSellerInfoDTO> queryPage);
}
