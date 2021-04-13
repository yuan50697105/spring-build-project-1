package org.example.spring.plugins.oss.minio;

import org.example.spring.plugins.oss.entity.OssResponse;

import java.io.InputStream;

public interface MinioOssService {
    OssResponse upload(String bucketName, String key, InputStream file, String contentType, String size);

    InputStream download(String bucketName, String key);

    String getPath(String bucketName, String key);
}
