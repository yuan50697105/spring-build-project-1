package org.example.plugins.oss.tencent.impl;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.PutObjectResult;
import org.example.plugins.oss.aliyun.AliyunOssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;

@Service
public class AliyunOssServiceImpl implements AliyunOssService {
    @Autowired
    private OSSClient ossClient;

    @Override
    public void upload(String bucketName, String key, File file) {
        PutObjectResult objectResult = ossClient.putObject(bucketName, key, file);
    }


    @Override
    public InputStream download(String bucketName, String key) {
        OSSObject object = ossClient.getObject(bucketName, key);
        return object.getObjectContent();

    }
}