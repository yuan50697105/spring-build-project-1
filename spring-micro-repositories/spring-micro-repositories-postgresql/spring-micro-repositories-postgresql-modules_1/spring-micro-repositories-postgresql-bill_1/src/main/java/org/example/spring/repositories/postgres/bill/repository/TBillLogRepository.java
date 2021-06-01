package org.example.spring.repositories.postgres.bill.repository;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.postgres.bill.table.dto.TBillLogDTO;
import org.example.spring.repositories.postgres.bill.table.query.TBillLogQuery;
import org.example.spring.repositories.postgres.bill.table.vo.TBillLogVo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TBillLogRepository {
    void save(TBillLogVo vo);

    void update(TBillLogVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TBillLogDTO get(Long id);

    Optional<TBillLogDTO> getOpt(Long id);

    TBillLogDTO queryOne(TBillLogQuery query);

    TBillLogDTO selectOne(TBillLogQuery query);

    Optional<TBillLogDTO> selectOneOpt(TBillLogQuery query);

    Optional<TBillLogDTO> queryOneOpt(TBillLogQuery query);

    TBillLogDTO queryFirst(TBillLogQuery query);

    Optional<TBillLogDTO> queryFirstOpt(TBillLogQuery query);

    TBillLogDTO selectFirst(TBillLogQuery query);

    Optional<TBillLogDTO> selectFirstOpt(TBillLogQuery query);

    List<TBillLogDTO> queryList(TBillLogQuery query);

    List<TBillLogDTO> selectList(TBillLogQuery query);

    Stream<TBillLogDTO> queryStream(TBillLogQuery query);

    Stream<TBillLogDTO> selectStream(TBillLogQuery query);

    List<TBillLogDTO> queryTop(TBillLogQuery query);

    Stream<TBillLogDTO> queryTopStream(TBillLogQuery query);

    List<TBillLogDTO> selectTop(TBillLogQuery query);

    Stream<TBillLogDTO> selectTopStream(TBillLogQuery query);

    IPageData<TBillLogDTO> selectPage(TBillLogQuery query);

    IPageData<TBillLogDTO> queryPage(TBillLogQuery query);

}
