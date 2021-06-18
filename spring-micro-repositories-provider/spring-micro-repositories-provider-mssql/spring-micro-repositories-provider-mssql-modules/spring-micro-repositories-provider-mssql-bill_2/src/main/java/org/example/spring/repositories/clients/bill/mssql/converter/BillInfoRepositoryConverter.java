package org.example.spring.repositories.clients.bill.mssql.converter;


import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.bill.dto.BillInfoDTO;
import org.example.spring.repositories.commons.entity.bill.query.BillInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillInfoVo;
import org.example.spring.repositories.mssql.bill.table.dto.TBillInfoDTO;
import org.example.spring.repositories.mssql.bill.table.query.TBillInfoQuery;
import org.example.spring.repositories.mssql.bill.table.vo.TBillInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface BillInfoRepositoryConverter {
    BillInfoRepositoryConverter CONVERTER = Mappers.getMapper(BillInfoRepositoryConverter.class);

    TBillInfoVo convertVo(BillInfoVo vo);

    TBillInfoVo[] convertVo(BillInfoVo[] vo);

    List<TBillInfoVo> convertVo(List<BillInfoVo> vo);

    TBillInfoQuery convertQuery(BillInfoQuery billInfoQuery);

    BillInfoDTO buildDTO(TBillInfoDTO tBillInfoDTO);

    List<BillInfoDTO> buildDTO(List<TBillInfoDTO> listByIds);

    IPageData<BillInfoDTO> buildDTO(IPageData<TBillInfoDTO> queryPage);
}
