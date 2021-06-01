package org.example.spring.daos.postgres.bill.repository;

import org.example.spring.daos.postgres.bill.table.dto.TBillItemsInfoDTO;
import org.example.spring.daos.postgres.bill.table.query.TBillItemsInfoQuery;
import org.example.spring.daos.postgres.bill.table.vo.TBillItemsInfoVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TBillItemsInfoRepository {
    void save(TBillItemsInfoVo vo);

    void update(TBillItemsInfoVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TBillItemsInfoDTO get(Long id);

    Optional<TBillItemsInfoDTO> getOpt(Long id);

    TBillItemsInfoDTO queryOne(TBillItemsInfoQuery query);

    TBillItemsInfoDTO selectOne(TBillItemsInfoQuery query);

    Optional<TBillItemsInfoDTO> selectOneOpt(TBillItemsInfoQuery query);

    Optional<TBillItemsInfoDTO> queryOneOpt(TBillItemsInfoQuery query);

    TBillItemsInfoDTO queryFirst(TBillItemsInfoQuery query);

    Optional<TBillItemsInfoDTO> queryFirstOpt(TBillItemsInfoQuery query);

    TBillItemsInfoDTO selectFirst(TBillItemsInfoQuery query);

    Optional<TBillItemsInfoDTO> selectFirstOpt(TBillItemsInfoQuery query);

    List<TBillItemsInfoDTO> queryList(TBillItemsInfoQuery query);

    List<TBillItemsInfoDTO> selectList(TBillItemsInfoQuery query);

    Stream<TBillItemsInfoDTO> queryStream(TBillItemsInfoQuery query);

    Stream<TBillItemsInfoDTO> selectStream(TBillItemsInfoQuery query);

    List<TBillItemsInfoDTO> queryTop(TBillItemsInfoQuery query);

    Stream<TBillItemsInfoDTO> queryTopStream(TBillItemsInfoQuery query);

    List<TBillItemsInfoDTO> selectTop(TBillItemsInfoQuery query);

    Stream<TBillItemsInfoDTO> selectTopStream(TBillItemsInfoQuery query);

    IPageData<TBillItemsInfoDTO> selectPage(TBillItemsInfoQuery query);

    IPageData<TBillItemsInfoDTO> queryPage(TBillItemsInfoQuery query);

    List<TBillItemsInfoDTO> queryListBySubId(Long subId);

    List<TBillItemsInfoDTO> queryListByBillId(Long billId);
}
