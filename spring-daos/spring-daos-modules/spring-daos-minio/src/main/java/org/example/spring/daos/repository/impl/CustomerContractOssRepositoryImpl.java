package org.example.spring.daos.repository.impl;

import lombok.AllArgsConstructor;
import org.example.spring.daos.repository.CustomerContractOssRepository;
import org.example.spring.plugins.commons.entity.OssResponse;
import org.example.spring.plugins.oss.minio.MinioOssService;
import org.springframework.stereotype.Repository;

import java.io.InputStream;

@Repository
@AllArgsConstructor
public class CustomerContractOssRepositoryImpl implements CustomerContractOssRepository {
    public static final String CONTRACT = "contract";
    private final MinioOssService minioOssService;

    @Override
    public OssResponse put(String file, String contentType, InputStream stream, String size) {
        return minioOssService.upload(CONTRACT, file, stream, contentType, size);
    }
}