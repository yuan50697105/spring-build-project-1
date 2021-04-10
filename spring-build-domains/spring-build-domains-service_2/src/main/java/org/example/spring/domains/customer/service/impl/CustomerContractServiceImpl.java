package org.example.spring.domains.customer.service.impl;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.spring.domains.customer.service.CustomerContractService;
import org.example.spring.infrastructures.minio.customer.repository.CustomerContractOssRepository;
import org.example.spring.infrastructures.mysql.customer.entity.query.CustomerContractQuery;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContract;
import org.example.spring.infrastructures.mysql.customer.entity.result.CustomerContractDetails;
import org.example.spring.infrastructures.mysql.customer.entity.vo.CustomerContractFormVo;
import org.example.spring.infrastructures.mysql.customer.repository.CustomerContractRepository;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.example.spring.plugins.oss.entity.OssResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class CustomerContractServiceImpl implements CustomerContractService {
    private final CustomerContractRepository customerContractRepository;
    private final CustomerContractOssRepository customerContractOssRepository;
    @Override
    public IPageData<CustomerContract> selectPage(CustomerContractQuery query) {
        return customerContractRepository.queryPage(query);
    }

    @Override
    public List<CustomerContract> selectList(CustomerContractQuery query) {
        return customerContractRepository.queryList(query);
    }

    @Override
    public List<CustomerContract> selectTop(CustomerContractQuery query) {
        return customerContractRepository.queryTop(query, query.getSize());
    }

    @Override
    public CustomerContract selectFirst(CustomerContractQuery query) {
        return customerContractRepository.queryFirst(query);
    }

    @Override
    public CustomerContract selectOne(CustomerContractQuery query) {
        return customerContractRepository.queryOne(query);
    }

    @Override
    public CustomerContractDetails get(Long id) {
        return customerContractRepository.getById(id);
    }

    @Override
    public void save(CustomerContractFormVo formVo) {
        customerContractRepository.save(formVo);
    }

    @Override
    public void update(CustomerContractFormVo formVo) {
        customerContractRepository.update(formVo);
    }

    @Override
    public void delete(List<Long> ids) {
        customerContractRepository.delete(ids);
    }

    @SneakyThrows
    @Override
    public void upload(Long id, MultipartFile file) {
        OssResponse response = customerContractOssRepository.put(id +"_"+ file.getOriginalFilename(), file.getContentType(), file.getInputStream());
        String fileName = response.getFileName();
        customerContractRepository.updateFile(id, fileName);
    }
}