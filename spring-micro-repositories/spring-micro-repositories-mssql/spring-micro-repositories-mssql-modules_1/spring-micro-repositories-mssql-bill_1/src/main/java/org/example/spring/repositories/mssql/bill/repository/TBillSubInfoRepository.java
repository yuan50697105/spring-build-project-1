package org.example.spring.repositories.mssql.bill.repository;

import org.example.spring.repositories.mssql.bill.table.dto.TBillSubInfoDTO;
import org.example.spring.repositories.mssql.bill.table.dto.TBillSubInfoDetailsDTO;
import org.example.spring.repositories.mssql.bill.table.query.TBillSubInfoQuery;
import org.example.spring.repositories.mssql.bill.table.vo.TBillSubInfoVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TBillSubInfoRepository {
    void save(TBillSubInfoVo vo);

    void update(TBillSubInfoVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TBillSubInfoDTO get(Long id);

    Optional<TBillSubInfoDTO> getOpt(Long id);

    TBillSubInfoDTO queryOne(TBillSubInfoQuery query);

    TBillSubInfoDTO selectOne(TBillSubInfoQuery query);

    Optional<TBillSubInfoDTO> selectOneOpt(TBillSubInfoQuery query);

    Optional<TBillSubInfoDTO> queryOneOpt(TBillSubInfoQuery query);

    TBillSubInfoDTO queryFirst(TBillSubInfoQuery query);

    Optional<TBillSubInfoDTO> queryFirstOpt(TBillSubInfoQuery query);

    TBillSubInfoDTO selectFirst(TBillSubInfoQuery query);

    Optional<TBillSubInfoDTO> selectFirstOpt(TBillSubInfoQuery query);

    List<TBillSubInfoDTO> queryList(TBillSubInfoQuery query);

    List<TBillSubInfoDTO> selectList(TBillSubInfoQuery query);

    Stream<TBillSubInfoDTO> queryStream(TBillSubInfoQuery query);

    Stream<TBillSubInfoDTO> selectStream(TBillSubInfoQuery query);

    List<TBillSubInfoDTO> queryTop(TBillSubInfoQuery query);

    Stream<TBillSubInfoDTO> queryTopStream(TBillSubInfoQuery query);

    List<TBillSubInfoDTO> selectTop(TBillSubInfoQuery query);

    Stream<TBillSubInfoDTO> selectTopStream(TBillSubInfoQuery query);

    IPageData<TBillSubInfoDTO> selectPage(TBillSubInfoQuery query);

    IPageData<TBillSubInfoDTO> queryPage(TBillSubInfoQuery query);

    TBillSubInfoDetailsDTO getDetails(Long id);

    List<TBillSubInfoDetailsDTO> queryDetailsListByBillId(Long billId);
}
