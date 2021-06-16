package org.example.spring.repositories.clients.bill.postgres.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.bill.dto.BillItemsInfoDTO;
import org.example.spring.repositories.commons.entity.bill.query.BillItemsInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillItemsInfoVo;
import org.example.spring.repositories.postgres.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.repositories.postgres.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.repositories.postgres.bill.table.vo.TBillItemsInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface BillItemsInfoRepositoryConverter {
    BillItemsInfoRepositoryConverter CONVERTER = Mappers.getMapper(BillItemsInfoRepositoryConverter.class);

    TBillItemsInfoVo convertVo(BillItemsInfoVo vo);

    TBillItemsInfoVo[] convertVo(BillItemsInfoVo[] vo);

    List<TBillItemsInfoVo> convertVo(List<BillItemsInfoVo> vo);

    TBillItemsInfoQuery convertQuery(BillItemsInfoQuery billItemsInfoQuery);

    BillItemsInfoDTO buildDto(TBillItemsInfoDTO tBillItemsInfoDTO);

    List<BillItemsInfoDTO> buildDto(List<TBillItemsInfoDTO> listByIds);

    IPageData<BillItemsInfoDTO> buildDto(IPageData<TBillItemsInfoDTO> queryPage);
}
