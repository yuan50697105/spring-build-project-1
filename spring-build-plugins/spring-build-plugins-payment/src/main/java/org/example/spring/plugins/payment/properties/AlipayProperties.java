package org.example.spring.plugins.payment.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = AlipayProperties.PAYMENT_ALIPAY)
@Data
public class AlipayProperties {
    public static final String PAYMENT_ALIPAY = "payment.alipay";
    private Boolean enabled = false;
    private String appId;
    private String privateKey;
    private String publicKey;
    private String appCertPath;
    private String aliPayCertPath;
    private String aliPayRootCertPath;
    private String serverUrl;
    private String domain;
}