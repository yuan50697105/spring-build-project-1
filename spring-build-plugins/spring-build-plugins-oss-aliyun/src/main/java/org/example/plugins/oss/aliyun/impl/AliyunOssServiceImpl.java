package org.example.plugins.oss.aliyun.impl;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.comm.ResponseMessage;
import com.aliyun.oss.model.PutObjectResult;
import org.example.plugins.oss.aliyun.AliyunOssService;
import org.example.plugins.oss.entity.OssResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class AliyunOssServiceImpl implements AliyunOssService {
    @Autowired
    private OSSClient ossClient;

    @Override
    public OssResult upload(String bucketName, String key, File file) {
        PutObjectResult objectResult = ossClient.putObject(bucketName, key, file);
        ResponseMessage response = objectResult.getResponse();
        return new OssResult();
    }
}