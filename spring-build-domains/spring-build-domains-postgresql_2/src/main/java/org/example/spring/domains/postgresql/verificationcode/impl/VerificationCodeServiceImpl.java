package org.example.spring.domains.mysql.verificationcode.impl;

import com.alibaba.cloud.spring.boot.sms.ISmsService;
import com.alibaba.cloud.spring.boot.sms.SmsReportMessageListener;
import com.alibaba.cloud.spring.boot.sms.SmsUpMessageListener;
import com.aliyun.mns.model.Message;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.verificationcode.VerificationCodeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class VerificationCodeServiceImpl implements VerificationCodeService, InitializingBean {
    private ISmsService smsService;

    @Override
    public SendSmsResponse send() throws ClientException {
        return smsService.sendSmsRequest(new SendSmsRequest());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        smsService.startSmsReportMessageListener(new SmsReportMessageListener() {
            @Override
            public boolean dealMessage(Message message) {
                return false;
            }
        });
        smsService.startSmsUpMessageListener(new SmsUpMessageListener() {
            @Override
            public boolean dealMessage(Message message) {
                return false;
            }
        });
    }
}