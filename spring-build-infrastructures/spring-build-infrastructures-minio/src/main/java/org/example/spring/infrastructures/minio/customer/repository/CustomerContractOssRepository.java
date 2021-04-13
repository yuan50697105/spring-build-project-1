package org.example.spring.infrastructures.minio.customer.repository;

import org.example.spring.plugins.oss.entity.OssResponse;

import java.io.InputStream;

public interface CustomerContractOssRepository {
    OssResponse put(String file, String contentType, InputStream stream, String size);
}
