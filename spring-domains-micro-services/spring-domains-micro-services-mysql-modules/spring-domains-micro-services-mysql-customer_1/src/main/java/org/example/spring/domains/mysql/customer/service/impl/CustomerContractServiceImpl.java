package org.example.spring.domains.mysql.customer.service.impl;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.spring.domains.mysql.customer.service.CustomerContractService;
import org.example.spring.models.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.models.mysql.customer.entity.result.CustomerContract;
import org.example.spring.models.mysql.customer.entity.result.CustomerContractDetails;
import org.example.spring.models.mysql.customer.entity.vo.CustomerContractModelVo;
import org.example.spring.models.mysql.customer.repository.CustomerContractRepository;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class CustomerContractServiceImpl implements CustomerContractService {
    private final CustomerContractRepository customerContractRepository;

    @Override
    public IPageData<CustomerContract> selectPage(CustomerContractQuery query) {
        return customerContractRepository.queryPage(query);
    }

    @Override
    public List<CustomerContract> selectList(CustomerContractQuery query) {
        return customerContractRepository.queryTop(query, query.getSize());
    }

    @Override
    public CustomerContract selectOne(CustomerContractQuery query) {
        return customerContractRepository.queryFirst(query);
    }

    @Override
    public CustomerContractDetails get(Long id) {
        return customerContractRepository.getDetailsById(id);
    }

    @Override
    public void save(CustomerContractModelVo formVo) {
        customerContractRepository.save(formVo);
    }

    @Override
    public void update(CustomerContractModelVo formVo) {
        customerContractRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        customerContractRepository.delete(ids);
    }

    @SneakyThrows
    @Override
    public void upload(Long id, MultipartFile file) {
        throw new RuntimeException("暂不支持");
    }
}