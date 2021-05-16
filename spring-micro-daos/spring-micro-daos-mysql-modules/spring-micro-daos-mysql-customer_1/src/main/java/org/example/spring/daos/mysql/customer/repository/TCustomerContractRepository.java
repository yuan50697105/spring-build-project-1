package org.example.spring.daos.mysql.customer.repository;

import org.example.spring.daos.mysql.customer.table.dto.TCustomerContractDTO;
import org.example.spring.daos.mysql.customer.table.query.TCustomerContractQuery;
import org.example.spring.daos.mysql.customer.table.vo.TCustomerContractVo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface TCustomerContractRepository {
    void save(TCustomerContractVo vo);

    void insert(TCustomerContractVo vo);

    void update(TCustomerContractVo vo);

    void delete(Long id);

    void delete(Long... ids);

    void delete(List<Long> ids);

    TCustomerContractDTO get(Long id);

    Optional<TCustomerContractDTO> getOpt(Long id);

    List<TCustomerContractDTO> queryList(TCustomerContractQuery query);

    List<TCustomerContractDTO> selectList(TCustomerContractQuery query);

    Stream<TCustomerContractDTO> queryStream(TCustomerContractQuery query);

    Stream<TCustomerContractDTO> selectStream(TCustomerContractQuery query);

    List<TCustomerContractDTO> queryTop(TCustomerContractQuery query);
}
