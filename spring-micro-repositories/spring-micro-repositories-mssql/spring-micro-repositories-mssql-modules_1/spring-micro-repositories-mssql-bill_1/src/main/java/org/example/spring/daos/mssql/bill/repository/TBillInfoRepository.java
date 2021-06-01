package org.example.spring.daos.mssql.bill.repository;

import org.example.spring.daos.mssql.bill.table.dto.TBillInfoDTO;
import org.example.spring.daos.mssql.bill.table.dto.TBillInfoDetailsDTO;
import org.example.spring.daos.mssql.bill.table.query.TBillInfoQuery;
import org.example.spring.daos.mssql.bill.table.vo.TBillInfoVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TBillInfoRepository {
    void save(TBillInfoVo vo);

    void update(TBillInfoVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TBillInfoDTO get(Long id);

    Optional<TBillInfoDTO> getOpt(Long id);

    TBillInfoDTO queryOne(TBillInfoQuery query);

    TBillInfoDTO selectOne(TBillInfoQuery query);

    Optional<TBillInfoDTO> selectOneOpt(TBillInfoQuery query);

    Optional<TBillInfoDTO> queryOneOpt(TBillInfoQuery query);

    TBillInfoDTO queryFirst(TBillInfoQuery query);

    Optional<TBillInfoDTO> queryFirstOpt(TBillInfoQuery query);

    TBillInfoDTO selectFirst(TBillInfoQuery query);

    Optional<TBillInfoDTO> selectFirstOpt(TBillInfoQuery query);

    List<TBillInfoDTO> queryList(TBillInfoQuery query);

    List<TBillInfoDTO> selectList(TBillInfoQuery query);

    Stream<TBillInfoDTO> queryStream(TBillInfoQuery query);

    Stream<TBillInfoDTO> selectStream(TBillInfoQuery query);

    List<TBillInfoDTO> queryTop(TBillInfoQuery query);

    Stream<TBillInfoDTO> queryTopStream(TBillInfoQuery query);

    List<TBillInfoDTO> selectTop(TBillInfoQuery query);

    Stream<TBillInfoDTO> selectTopStream(TBillInfoQuery query);

    IPageData<TBillInfoDTO> selectPage(TBillInfoQuery query);

    IPageData<TBillInfoDTO> queryPage(TBillInfoQuery query);

    TBillInfoDetailsDTO getDetails(Long id);

}
