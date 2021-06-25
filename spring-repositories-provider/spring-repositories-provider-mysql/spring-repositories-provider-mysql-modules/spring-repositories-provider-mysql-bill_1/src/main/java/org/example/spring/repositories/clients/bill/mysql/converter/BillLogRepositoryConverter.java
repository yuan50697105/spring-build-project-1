package org.example.spring.repositories.clients.bill.mysql.converter;

import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.bill.mysql.table.dto.TBillLogDTO;
import org.example.spring.repositories.bill.mysql.table.query.TBillLogQuery;
import org.example.spring.repositories.bill.mysql.table.vo.TBillLogVo;
import org.example.spring.repositories.commons.entity.bill.dto.BillLogDTO;
import org.example.spring.repositories.commons.entity.bill.query.BillLogQuery;
import org.example.spring.repositories.commons.entity.bill.vo.BillLogVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = BaseBuilder.class)
public interface BillLogRepositoryConverter {
    BillLogRepositoryConverter CONVERTER = Mappers.getMapper(BillLogRepositoryConverter.class);

    TBillLogVo convertVo(BillLogVo vo);

    TBillLogVo[] convertVo(BillLogVo[] vo);

    List<TBillLogVo> convertVo(List<BillLogVo> vo);

    TBillLogQuery convertQuery(BillLogQuery billLogQuery);

    BillLogDTO buildDto(TBillLogDTO tBillLogDTO);

    List<BillLogDTO> buildDto(List<TBillLogDTO> listByIds);

    IPageData<BillLogDTO> buildDto(IPageData<TBillLogDTO> queryPage);
}
