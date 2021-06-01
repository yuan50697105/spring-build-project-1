package org.example.spring.daos.postgres.customer.repository;

import org.example.spring.daos.postgres.customer.table.dto.TCustomerContractDTO;
import org.example.spring.daos.postgres.customer.table.query.TCustomerContractQuery;
import org.example.spring.daos.postgres.customer.table.vo.TCustomerContractVo;
import org.example.spring.plugins.commons.entity.IPageData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TCustomerContractRepository {
    void save(TCustomerContractVo vo);

    void update(TCustomerContractVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TCustomerContractDTO get(Long id);

    Optional<TCustomerContractDTO> getOpt(Long id);

    TCustomerContractDTO queryOne(TCustomerContractQuery query);

    TCustomerContractDTO selectOne(TCustomerContractQuery query);

    Optional<TCustomerContractDTO> selectOneOpt(TCustomerContractQuery query);

    Optional<TCustomerContractDTO> queryOneOpt(TCustomerContractQuery query);

    TCustomerContractDTO queryFirst(TCustomerContractQuery query);

    Optional<TCustomerContractDTO> queryFirstOpt(TCustomerContractQuery query);

    TCustomerContractDTO selectFirst(TCustomerContractQuery query);

    Optional<TCustomerContractDTO> selectFirstOpt(TCustomerContractQuery query);

    List<TCustomerContractDTO> queryList(TCustomerContractQuery query);

    List<TCustomerContractDTO> selectList(TCustomerContractQuery query);

    Stream<TCustomerContractDTO> queryStream(TCustomerContractQuery query);

    Stream<TCustomerContractDTO> selectStream(TCustomerContractQuery query);

    List<TCustomerContractDTO> queryTop(TCustomerContractQuery query);

    Stream<TCustomerContractDTO> queryTopStream(TCustomerContractQuery query);

    List<TCustomerContractDTO> selectTop(TCustomerContractQuery query);

    Stream<TCustomerContractDTO> selectTopStream(TCustomerContractQuery query);

    IPageData<TCustomerContractDTO> selectPage(TCustomerContractQuery query);

    IPageData<TCustomerContractDTO> queryPage(TCustomerContractQuery query);
}
