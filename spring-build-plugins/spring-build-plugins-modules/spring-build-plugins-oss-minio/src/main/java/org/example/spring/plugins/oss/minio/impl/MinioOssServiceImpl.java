package org.example.spring.plugins.oss.minio.impl;

import io.minio.*;
import io.minio.http.Method;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.spring.plugins.commons.entity.OssResponse;
import org.example.spring.plugins.oss.minio.MinioOssService;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.IdentityHashMap;

@Service
@AllArgsConstructor
public class MinioOssServiceImpl implements MinioOssService {
    private final MinioClient minioClient;

    @SneakyThrows
    @Override
    public OssResponse upload(String bucketName, String key, InputStream file, String contentType, String size) {
        boolean bucketExists = minioClient.bucketExists(bucketName);
        if (!bucketExists) {
            minioClient.makeBucket(bucketName);
        }
        minioClient.putObject(bucketName, key, file, size);
        String object = minioClient.presignedGetObject(bucketName, key);
        return new OssResponse(key, bucketName, object);
    }

    @SneakyThrows
    @Override
    public InputStream download(String bucketName, String key) {
        return minioClient.getObject(bucketName, key);
    }

    @SneakyThrows
    @Override
    public String getPath(String bucketName, String key) {
        return minioClient.getPresignedObjectUrl(Method.GET, bucketName, key, 1, new IdentityHashMap<>());
    }
}