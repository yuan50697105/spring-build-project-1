package org.example.plugins.oss.aliyun;

import java.io.File;
import java.io.InputStream;

public interface AliyunOssService {
    void upload(String bucketName, String key, File file);

    InputStream download(String bucketName, String key);
}
