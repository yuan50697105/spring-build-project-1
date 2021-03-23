package org.example.plugins.oss.tencent.configuration;

import com.qcloud.cos.COSClient;
import org.example.plugins.oss.tencent.properties.COSClientProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(COSClientProperties.class)
public class COSClientAutoConfiguration {
    @Autowired
    private COSClientProperties properties;

//    @Bean
//    @ConditionalOnBean(COSClient.class)
//    public COSClient client() {
//        COSClient cosClient = new COSClient();
//        return cosClient;
//    }
}