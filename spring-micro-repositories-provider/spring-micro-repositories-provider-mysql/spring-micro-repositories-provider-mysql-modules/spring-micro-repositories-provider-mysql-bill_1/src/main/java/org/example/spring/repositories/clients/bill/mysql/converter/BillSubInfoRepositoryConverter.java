package org.example.spring.repositories.clients.bill.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.commons.entity.bill.dto.BillSubInfoDTO;
import org.example.spring.repositories.commons.entity.bill.query.BillSubInfoQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillSubInfoVo;
import org.example.spring.repositories.bill.mysql.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.bill.mysql.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillSubInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface BillSubInfoRepositoryConverter {
    BillSubInfoRepositoryConverter CONVERTER = Mappers.getMapper(BillSubInfoRepositoryConverter.class);

    TBillSubInfoVo convertVo(BillSubInfoVo vo);

    TBillSubInfoVo[] convertVo(BillSubInfoVo[] vo);

    List<TBillSubInfoVo> convertVo(List<BillSubInfoVo> vo);

    TBillSubInfoQuery convertQuery(BillSubInfoQuery billSubInfoQuery);

    BillSubInfoDTO buildDto(TBillSubInfoDTO tBillSubInfoDTO);

    List<BillSubInfoDTO> buildDto(List<TBillSubInfoDTO> listByIds);

    IPageData<BillSubInfoDTO> buildDto(IPageData<TBillSubInfoDTO> queryPage);
}
