package org.example.plugins.commons.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import cn.hutool.crypto.symmetric.AES;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/**
 * @author yuane
 */
public class RSAUtils {
    private static final String privateKeyBase64 = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAK+Py+JiOmCZunu4jcDpc/9cH9Wm7AxWmO8KAiNazl0TTYYErWcgiEXYenwATCkMP4WmqqZXnH0Zi1HYbEY7WYZytgYJAueHeRMWd4w52Uq5vhWVzsdAZjzlbzWvH7wWy29ouZDvt6X8aOJPuujT8O08IxrXMKZefxkqgH1Wv5hTAgMBAAECgYAYm402ZBJOq/2JjerAmXha2KzVo5n+eLzi9IIsNnQqc6QwHsO3asXvFFLGwrvqHP9iWmQdALa8ijIO/MjgZz068XJ9Li7sBQZDzPVp+MK/JmY4OcR7uw2Z70gAQc9fYrqJTR1pJK/dG7cQvME8qV6fpqZXOWl6T5xTVJ3wxtyjkQJBAOkVvkATxdpdS6TRG+6n9OJ8XA8yrUtZt86ZLGfNCOuazoN5qFo4u0r3fOvsmN+gR9UCNpXuBEsMrPCbGC/S1T0CQQDA0lCSlnLGZ7nBGOWA9XntLc8m8gGOrb1NoJjrCGzFI0AzmJQyCGz2VDul2t6Rg2ThMVZpQoeDy4UdRH/T5JzPAkEAt7EUE6nBlttJ3yWRbt9dBhVd8/hLTIPzcNWUgmW7Lvr83+7D9/6X1HgBMmlu/WZy1fN9k2FWbtMZhDGmuSHePQJAcigRq7eGnBAs2TV0KrUqSlEko1oDsgUKXjsGTZ/fRZdpGyLqGfUDDZMw/TBnNJ8lymz7S7YnpM+JL5quUzS14QJAbtKTGVohiYOFD42U59lBp72S78B9zi0I3gXVpDliJ9K+mbbb3TLBIyuLW6mChpIAEQO2aYo0m5CGBW9jjNAqMA==";
    private static final String publicKeyBase64 = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCvj8viYjpgmbp7uI3A6XP/XB/VpuwMVpjvCgIjWs5dE02GBK1nIIhF2Hp8AEwpDD+FpqqmV5x9GYtR2GxGO1mGcrYGCQLnh3kTFneMOdlKub4Vlc7HQGY85W81rx+8FstvaLmQ77el/GjiT7ro0/DtPCMa1zCmXn8ZKoB9Vr+YUwIDAQAB";
    public static void generateRSA(String[] args) {
        RSA rsa = SecureUtil.rsa();
        String privateKeyBase64 = rsa.getPrivateKeyBase64();
        String publicKeyBase64 = rsa.getPublicKeyBase64();
        System.out.println("privateKeyBase64 = \"" + privateKeyBase64+"\"");
        System.out.println("publicKeyBase64 = \"" + publicKeyBase64+"\"");
    }

    public static void main(String[] args) {
        String data = UUID.randomUUID().toString();
        System.out.println("data = " + data);
        RSA rsa = SecureUtil.rsa(privateKeyBase64, publicKeyBase64);
        String privateKeyEncryption = StrUtil.str(rsa.encrypt(StrUtil.bytes(data, StandardCharsets.ISO_8859_1), KeyType.PrivateKey), StandardCharsets.ISO_8859_1);
        System.out.println("privateKeyEncryption = " + privateKeyEncryption);
        String publicKeyDecryption = StrUtil.str(rsa.decrypt(StrUtil.bytes(privateKeyEncryption, StandardCharsets.ISO_8859_1), KeyType.PublicKey), StandardCharsets.ISO_8859_1);
        System.out.println("publicKeyDecryption = " + publicKeyDecryption);
        Sign sign = SecureUtil.sign(SignAlgorithm.MD5withRSA, privateKeyBase64, publicKeyBase64);
        String signStr = new String(sign.sign(data.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.ISO_8859_1);
        System.out.println("signStr = " + signStr);
        boolean verify = sign.verify(data.getBytes(StandardCharsets.ISO_8859_1), signStr.getBytes(StandardCharsets.ISO_8859_1));
        System.out.println("verify = " + verify);
        AES aes = SecureUtil.aes();
        Cipher cipher = aes.getCipher();
        System.out.println("cipher = " + cipher);
        SecretKey secretKey = aes.getSecretKey();
        System.out.println("secretKey = " + secretKey);
        String aesEncrypt = new String(aes.encrypt(data), StandardCharsets.UTF_8);
        System.out.println("aesEncrypt = " + aesEncrypt);
        String aesDecrypt = new String(aes.decrypt(aesEncrypt), StandardCharsets.UTF_8);
        System.out.println("aesDecrypt = " + aesDecrypt);
        String algorithm = aes.getSecretKey().getAlgorithm();
        System.out.println("algorithm = " + algorithm);
        String algorithm1 = aes.getCipher().getAlgorithm();
        System.out.println("algorithm1 = " + algorithm1);


    }

}