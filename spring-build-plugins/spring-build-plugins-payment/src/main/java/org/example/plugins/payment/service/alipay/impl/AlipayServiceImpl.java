package org.example.plugins.payment.service.alipay.impl;

import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.ijpay.alipay.AliPayApi;
import com.ijpay.alipay.AliPayApiConfig;
import com.ijpay.alipay.AliPayApiConfigKit;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.plugins.payment.properties.AlipayProperties;
import org.example.plugins.payment.service.alipay.AlipayService;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import static com.alipay.api.AlipayConstants.NOTIFY_URL;
import static com.alipay.api.AlipayConstants.RETURN_URL;

@AllArgsConstructor
public class AlipayServiceImpl implements AlipayService {
    private final AlipayProperties alipayProperties;
    private final AliPayApiConfig aliPayApiConfig;

    @PostConstruct
    public void init() {
        AliPayApiConfigKit.setThreadLocalAliPayApiConfig(aliPayApiConfig);
    }

    @SneakyThrows
    @Override
    public String appPay(AlipayTradeAppPayModel model) {
        return AliPayApi.appPayToResponse(model, alipayProperties.getDomain() + NOTIFY_URL).getBody();
    }

    @SneakyThrows
    @Override
    public void wapPay(HttpServletResponse response, AlipayTradeWapPayModel model) {
        AliPayApi.wapPay(response, model, alipayProperties.getDomain() + RETURN_URL, alipayProperties.getDomain() + NOTIFY_URL);
    }

}