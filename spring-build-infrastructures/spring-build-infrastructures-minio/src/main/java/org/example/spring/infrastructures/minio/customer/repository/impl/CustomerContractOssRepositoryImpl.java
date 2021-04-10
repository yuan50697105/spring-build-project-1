package org.example.spring.infrastructures.minio.customer.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.minio.customer.repository.CustomerContractOssRepository;
import org.example.spring.plugins.oss.minio.MinioOssService;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CustomerContractOssRepositoryImpl implements CustomerContractOssRepository {
    private final MinioOssService minioOssService;
}