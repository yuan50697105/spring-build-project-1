package org.example.plugins.commons.utils;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import org.example.plugins.commons.entity.DataDTO;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.UUID;

/**
 * @author yuane
 */
public class RSAAESUtils {

    public static DataDTO encrypt(Object data) {
        DataDTO dataDTO = new DataDTO();
        RSA rsa = SecureUtil.rsa();
        byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();
        AES aes = SecureUtil.aes(key);
        byte[] dataEncrypt = aes.encrypt(JSONUtil.toJsonStr(data));
        byte[] keyEncrypt = rsa.encrypt(key, KeyType.PrivateKey);
        byte[] bytes = new byte[dataEncrypt.length + keyEncrypt.length];
        System.arraycopy(keyEncrypt, 0, bytes, 0, keyEncrypt.length);
        System.arraycopy(dataEncrypt, 0, bytes, keyEncrypt.length, dataEncrypt.length);
        String encode = Base64.encode(bytes);
        dataDTO.setPrivateKey(rsa.getPrivateKeyBase64());
        dataDTO.setPublicKey(rsa.getPublicKeyBase64());
        dataDTO.setEncrptData(encode);
        return dataDTO;
    }

    public static  <T> T decrypt(DataDTO dataDTO, Class<T> type) {
        String data = "";
        RSA rsa = SecureUtil.rsa(dataDTO.getPrivateKey(), dataDTO.getPublicKey());
        byte[] decode = Base64.decode(dataDTO.getEncrptData());
        int length = decode.length - 128;
        byte[] keys = new byte[128];
        byte[] dataBytes = new byte[length];
        System.arraycopy(decode, 0, keys, 0, 128);
        System.arraycopy(decode, 128, dataBytes, 0, length);
        byte[] decrypt = rsa.decrypt(keys, KeyType.PublicKey);
        AES aes = SecureUtil.aes(decrypt);
        String decryptStr = aes.decryptStr(dataBytes);
        return JSONUtil.toBean(decryptStr, type);
    }

}