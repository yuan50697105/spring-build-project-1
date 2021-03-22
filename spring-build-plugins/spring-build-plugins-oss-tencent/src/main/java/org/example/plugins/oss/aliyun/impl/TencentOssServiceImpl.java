package org.example.plugins.oss.aliyun.impl;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.model.PutObjectResult;
import org.example.plugins.oss.aliyun.TencentOssService;
import org.example.plugins.oss.entity.OssResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class TencentOssServiceImpl implements TencentOssService {
    @Autowired
    private COSClient client;

    @Override
    public OssResult upload(String bucketName, String key, File file) {
        PutObjectResult objectResult = client.putObject(bucketName, key, file);
        return new OssResult();
    }
}