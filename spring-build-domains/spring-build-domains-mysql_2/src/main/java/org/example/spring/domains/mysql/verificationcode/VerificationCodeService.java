package org.example.spring.domains.verificationcode;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;

public interface VerificationCodeService {
    SendSmsResponse send() throws ClientException;
}
