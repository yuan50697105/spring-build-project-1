package org.example.plugins.payment.alipay.configuration;

import com.ijpay.alipay.AliPayApiConfig;
import com.ijpay.alipay.AliPayApiConfigKit;
import org.example.plugins.payment.alipay.properties.AlipayProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AlipayProperties.class)
public class AlipayConfiguration {
    @Autowired
    private AlipayProperties alipayProperties;

    @Bean
    public AliPayApiConfig aliPayApiConfig() {
        AliPayApiConfig aliPayApiConfig;
        try {
            aliPayApiConfig = AliPayApiConfigKit.getApiConfig(alipayProperties.getAppId());
        } catch (Exception e) {
            aliPayApiConfig = AliPayApiConfig.builder()
                    .setAppId(alipayProperties.getAppId())
                    .setAliPayPublicKey(alipayProperties.getPublicKey())
                    .setAppCertPath(alipayProperties.getAppCertPath())
                    .setAliPayCertPath(alipayProperties.getAliPayCertPath())
                    .setAliPayRootCertPath(alipayProperties.getAliPayRootCertPath())
                    .setCharset("UTF-8")
                    .setPrivateKey(alipayProperties.getPrivateKey())
                    .setServiceUrl(alipayProperties.getServerUrl())
                    .setSignType("RSA2")
                    // 普通公钥方式
                    //.build();
                    // 证书模式
                    .buildByCert();

        }
        return aliPayApiConfig;
    }
}