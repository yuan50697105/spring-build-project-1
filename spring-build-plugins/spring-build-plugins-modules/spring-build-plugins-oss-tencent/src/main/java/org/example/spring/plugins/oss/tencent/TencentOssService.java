package org.example.spring.plugins.oss.tencent;

import java.io.File;
import java.io.InputStream;

public interface TencentOssService {
    void upload(String bucketName, String key, File file);

    InputStream download(String bucketName, String key);
}
