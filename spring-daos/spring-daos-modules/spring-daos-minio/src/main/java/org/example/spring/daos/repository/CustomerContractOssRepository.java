package org.example.spring.daos.repository;

import org.example.spring.plugins.commons.entity.OssResponse;

import java.io.InputStream;

public interface CustomerContractOssRepository {
    OssResponse put(String file, String contentType, InputStream stream, String size);
}
