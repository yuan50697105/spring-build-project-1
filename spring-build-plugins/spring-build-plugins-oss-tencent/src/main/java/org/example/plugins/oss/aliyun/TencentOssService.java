package org.example.plugins.oss.aliyun;

import org.example.plugins.oss.OssService;
import org.example.plugins.oss.entity.OssResult;

import java.io.File;

public interface TencentOssService extends OssService {
    OssResult upload(String bucketName, String key, File file);
}
