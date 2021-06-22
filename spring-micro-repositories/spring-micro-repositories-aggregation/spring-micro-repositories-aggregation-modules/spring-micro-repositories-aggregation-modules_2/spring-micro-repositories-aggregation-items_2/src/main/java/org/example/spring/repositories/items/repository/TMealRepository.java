package org.example.spring.repositories.items.repository;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.items.table.dto.TMealDTO;
import org.example.spring.repositories.items.table.dto.TMealFeeItemDTO;
import org.example.spring.repositories.items.table.query.TMealQuery;
import org.example.spring.repositories.items.table.vo.TMealVo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TMealRepository {

    void save(TMealVo vo);

    void update(TMealVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TMealDTO get(Long id);

    Optional<TMealDTO> getOpt(Long id);

    TMealDTO queryOne(TMealQuery query);

    TMealDTO selectOne(TMealQuery query);

    Optional<TMealDTO> selectOneOpt(TMealQuery query);

    Optional<TMealDTO> queryOneOpt(TMealQuery query);

    TMealDTO queryFirst(TMealQuery query);

    Optional<TMealDTO> queryFirstOpt(TMealQuery query);

    TMealDTO selectFirst(TMealQuery query);

    Optional<TMealDTO> selectFirstOpt(TMealQuery query);

    List<TMealDTO> queryList(TMealQuery query);

    List<TMealDTO> selectList(TMealQuery query);

    Stream<TMealDTO> queryStream(TMealQuery query);

    Stream<TMealDTO> selectStream(TMealQuery query);

    List<TMealDTO> queryTop(TMealQuery query);

    List<TMealDTO> selectTop(TMealQuery query);

    Stream<TMealDTO> queryTopStream(TMealQuery query);

    Stream<TMealDTO> selectTopStream(TMealQuery query);

    IPageData<TMealDTO> selectPage(TMealQuery query);

    IPageData<TMealDTO> queryPage(TMealQuery query);

    TMealFeeItemDTO getDetails(Long id);

}
