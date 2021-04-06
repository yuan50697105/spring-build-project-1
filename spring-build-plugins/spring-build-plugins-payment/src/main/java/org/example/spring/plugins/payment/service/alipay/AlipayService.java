package org.example.spring.plugins.payment.service.alipay;

import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import lombok.SneakyThrows;

import javax.servlet.http.HttpServletResponse;

public interface AlipayService {
    String appPay(AlipayTradeAppPayModel model);

    @SneakyThrows
    void wapPay(HttpServletResponse response, AlipayTradeWapPayModel model);
}