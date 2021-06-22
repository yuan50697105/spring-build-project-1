package org.example.spring.repositories.aggregation.items.repository;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.aggregation.items.table.dto.TCheckItemDTO;
import org.example.spring.repositories.aggregation.items.table.query.TCheckItemQuery;
import org.example.spring.repositories.aggregation.items.table.vo.TCheckItemVo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TCheckItemRepository {

    void save(TCheckItemVo vo);

    void update(TCheckItemVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TCheckItemDTO get(Long id);

    Optional<TCheckItemDTO> getOpt(Long id);

    TCheckItemDTO queryOne(TCheckItemQuery query);

    TCheckItemDTO selectOne(TCheckItemQuery query);

    Optional<TCheckItemDTO> selectOneOpt(TCheckItemQuery query);

    Optional<TCheckItemDTO> queryOneOpt(TCheckItemQuery query);

    TCheckItemDTO queryFirst(TCheckItemQuery query);

    Optional<TCheckItemDTO> queryFirstOpt(TCheckItemQuery query);

    TCheckItemDTO selectFirst(TCheckItemQuery query);

    Optional<TCheckItemDTO> selectFirstOpt(TCheckItemQuery query);

    List<TCheckItemDTO> queryList(TCheckItemQuery query);

    List<TCheckItemDTO> selectList(TCheckItemQuery query);

    Stream<TCheckItemDTO> queryStream(TCheckItemQuery query);

    Stream<TCheckItemDTO> selectStream(TCheckItemQuery query);

    List<TCheckItemDTO> queryTop(TCheckItemQuery query);

    List<TCheckItemDTO> selectTop(TCheckItemQuery query);

    Stream<TCheckItemDTO> queryTopStream(TCheckItemQuery query);

    Stream<TCheckItemDTO> selectTopStream(TCheckItemQuery query);

    IPageData<TCheckItemDTO> selectPage(TCheckItemQuery query);

    IPageData<TCheckItemDTO> queryPage(TCheckItemQuery query);

    List<TCheckItemDTO> queryListByFeeItemId(Long id);
}
