package org.example.spring.plugins.payment;

import com.ijpay.alipay.AliPayApiConfig;
import com.ijpay.alipay.AliPayApiConfigKit;
import lombok.SneakyThrows;
import org.example.spring.plugins.payment.properties.AlipayProperties;
import org.example.spring.plugins.payment.service.alipay.AlipayService;
import org.example.spring.plugins.payment.service.alipay.impl.AlipayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AlipayProperties.class)
@ComponentScan
public class PaymentConfiguration {
    @Autowired
    private AlipayProperties alipayProperties;

    @SneakyThrows
    @Bean
    @ConditionalOnSingleCandidate
    @ConditionalOnProperty(prefix = AlipayProperties.PAYMENT_ALIPAY, name = "enabled", havingValue = "true")
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

    @Bean
    @ConditionalOnSingleCandidate
    @ConditionalOnProperty(prefix = AlipayProperties.PAYMENT_ALIPAY, name = "enabled", havingValue = "true")
    public AlipayService alipayService(AliPayApiConfig aliPayApiConfig) {
        return new AlipayServiceImpl(alipayProperties, aliPayApiConfig);
    }
}