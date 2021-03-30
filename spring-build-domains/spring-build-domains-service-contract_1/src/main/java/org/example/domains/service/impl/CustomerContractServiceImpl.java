package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.service.CustomerContractService;
import org.example.modules.repository.mysql.entity.query.CustomerContractQuery;
import org.example.modules.repository.mysql.entity.result.CustomerContract;
import org.example.modules.repository.mysql.entity.vo.CustomerContractFormVo;
import org.example.modules.repository.mysql.repository.CustomerContractRepository;
import org.example.plugins.mybatis.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CustomerContractServiceImpl implements CustomerContractService {
    private final CustomerContractRepository customerContractRepository;

    @Override
    public void save(CustomerContractFormVo formVo) {
        customerContractRepository.saveWithId(formVo);
    }

    @Override
    public void update(CustomerContractFormVo formVo) {
        customerContractRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        customerContractRepository.delete(ids);
    }

    @Override
    public CustomerContract get(Long id) {
        return customerContractRepository.getById(id);
    }

    @Override
    public CustomerContract one(CustomerContractQuery query) {
        return customerContractRepository.queryOne(query);
    }

    @Override
    public List<CustomerContract> list(CustomerContractQuery query) {
        return customerContractRepository.queryTop(query, query.getSize());
    }

    @Override
    public IPageData<CustomerContract> page(CustomerContractQuery query) {
        return customerContractRepository.queryPage(query);
    }
}