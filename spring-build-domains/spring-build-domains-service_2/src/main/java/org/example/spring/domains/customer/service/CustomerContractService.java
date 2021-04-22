package org.example.spring.domains.customer.service;

import org.example.spring.models.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.customer.entity.result.CustomerContract;
import org.example.spring.models.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.customer.entity.vo.CustomerContractModelVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface CustomerContractService {
    IPageData<CustomerContract> selectPage(CustomerContractQuery query);

    List<CustomerContract> selectList(CustomerContractQuery query);

    CustomerContract selectOne(CustomerContractQuery query);

    default Optional<CustomerContract> seletOneOpt(CustomerContractQuery query) {
        return Optional.ofNullable(selectOne(query));
    }

    CustomerContractDetails get(Long id);

    default Optional<CustomerContractDetails> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    void save(CustomerContractModelVo formVo);

    void update(CustomerContractModelVo formVo);

    void delete(List<Long> ids);

    void upload(Long id, MultipartFile file);
}
