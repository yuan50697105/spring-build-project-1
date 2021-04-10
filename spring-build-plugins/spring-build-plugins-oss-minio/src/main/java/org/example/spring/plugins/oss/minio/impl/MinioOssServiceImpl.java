package org.example.spring.plugins.oss.minio.impl;

import io.minio.*;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.spring.plugins.oss.entity.OssResponse;
import org.example.spring.plugins.oss.minio.MinioOssService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;

@Service
@AllArgsConstructor
public class MinioOssServiceImpl implements MinioOssService {
    private final MinioClient minioClient;

    @SneakyThrows
    @Override
    public OssResponse upload(String bucketName, String key, InputStream file, String contentType) {
        boolean bucketExists = minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
        if (!bucketExists) {
            minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
        }
        PutObjectArgs.Builder builder = PutObjectArgs
                .builder()
                .bucket(bucketName)
                .contentType(contentType)
                .object(key).stream(file, -1, -1);
        ObjectWriteResponse response = minioClient.putObject(builder.build());
        return new OssResponse(response.object(),response.bucket(),null);
    }

    @SneakyThrows
    @Override
    public InputStream download(String bucketName, String key) {
        return minioClient.getObject(GetObjectArgs.builder().bucket(bucketName).object(key).build());
    }

    @SneakyThrows
    @Override
    public String getPath(String bucketName, String key) {
        return minioClient.getPresignedObjectUrl(GetPresignedObjectUrlArgs.builder().bucket(bucketName).object(key).build());
    }
}