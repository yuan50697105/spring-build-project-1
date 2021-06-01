package org.example.spring.repositories.postgres.items.repository;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.postgres.items.table.dto.TFeeCheckItemDTO;
import org.example.spring.repositories.postgres.items.table.dto.TFeeItemDTO;
import org.example.spring.repositories.postgres.items.table.query.TFeeItemQuery;
import org.example.spring.repositories.postgres.items.table.vo.TFeeItemVo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TFeeItemRepository {

    void save(TFeeItemVo vo);

    void update(TFeeItemVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TFeeItemDTO get(Long id);

    Optional<TFeeItemDTO> getOpt(Long id);

    TFeeItemDTO queryOne(TFeeItemQuery query);

    TFeeItemDTO selectOne(TFeeItemQuery query);

    Optional<TFeeItemDTO> selectOneOpt(TFeeItemQuery query);

    Optional<TFeeItemDTO> queryOneOpt(TFeeItemQuery query);

    TFeeItemDTO queryFirst(TFeeItemQuery query);

    Optional<TFeeItemDTO> queryFirstOpt(TFeeItemQuery query);

    TFeeItemDTO selectFirst(TFeeItemQuery query);

    Optional<TFeeItemDTO> selectFirstOpt(TFeeItemQuery query);

    List<TFeeItemDTO> queryList(TFeeItemQuery query);

    List<TFeeItemDTO> selectList(TFeeItemQuery query);

    Stream<TFeeItemDTO> queryStream(TFeeItemQuery query);

    Stream<TFeeItemDTO> selectStream(TFeeItemQuery query);

    List<TFeeItemDTO> queryTop(TFeeItemQuery query);

    List<TFeeItemDTO> selectTop(TFeeItemQuery query);

    Stream<TFeeItemDTO> queryTopStream(TFeeItemQuery query);

    Stream<TFeeItemDTO> selectTopStream(TFeeItemQuery query);

    IPageData<TFeeItemDTO> selectPage(TFeeItemQuery query);

    IPageData<TFeeItemDTO> queryPage(TFeeItemQuery query);

    TFeeCheckItemDTO getDetails(Long id);

    List<TFeeItemDTO> queryListByMealId(Long id);
}
