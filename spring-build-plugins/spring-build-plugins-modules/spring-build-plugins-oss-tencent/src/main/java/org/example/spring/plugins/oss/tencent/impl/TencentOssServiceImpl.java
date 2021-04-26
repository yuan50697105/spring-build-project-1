package org.example.spring.plugins.oss.tencent.impl;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.model.COSObject;
import com.qcloud.cos.model.COSObjectInputStream;
import com.qcloud.cos.model.PutObjectResult;
import org.example.spring.plugins.oss.tencent.TencentOssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;

@Service
public class TencentOssServiceImpl implements TencentOssService {
    @Autowired
    private COSClient client;

    @Override
    public void upload(String bucketName, String key, File file) {
        PutObjectResult objectResult = client.putObject(bucketName, key, file);
    }

    @Override
    public InputStream download(String bucketName, String key) {
        COSObject object = client.getObject(bucketName, key);
        COSObjectInputStream inputStream = object.getObjectContent();
        return inputStream;
    }
}