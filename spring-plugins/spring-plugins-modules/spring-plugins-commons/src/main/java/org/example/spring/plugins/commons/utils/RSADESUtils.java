package org.example.spring.plugins.commons.utils;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.crypto.symmetric.DES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.json.JSONUtil;
import org.example.spring.plugins.commons.entity.DataDTO;

public class RSADESUtils {
    public static DataDTO encrypt(Object data) {
        DataDTO dataDTO = new DataDTO();
        byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.DES.getValue()).getEncoded();
        DES des = SecureUtil.des(key);
        byte[] encrypt = des.encrypt(JSONUtil.toJsonStr(data));
        RSA rsa = SecureUtil.rsa();
        byte[] encrypt1 = rsa.encrypt(key, KeyType.PrivateKey);
        byte[] bytes = new byte[encrypt1.length + encrypt.length];
        System.arraycopy(encrypt1, 0, bytes, 0, encrypt1.length);
        System.arraycopy(encrypt, 0, bytes, encrypt1.length, encrypt.length);
        dataDTO.setPrivateKey(rsa.getPrivateKeyBase64());
        dataDTO.setPublicKey(rsa.getPublicKeyBase64());
        dataDTO.setEncrptData(Base64.encode(bytes));
        return dataDTO;
    }

    public static <T> T decrypt(DataDTO dataDTO, Class<T> type) {
        byte[] decode = Base64.decode(dataDTO.getEncrptData());
        byte[] keys = new byte[8];
        byte[] bytes = new byte[decode.length - 8];
        System.arraycopy(decode, 0, keys, 0, 8);
        System.arraycopy(decode, 8, bytes, 0, bytes.length);
        RSA rsa = SecureUtil.rsa(dataDTO.getPrivateKey(), dataDTO.getPublicKey());
        byte[] decrypt = rsa.decrypt(keys, KeyType.PublicKey);
        DES des = SecureUtil.des(decrypt);
        String decryptStr = des.decryptStr(bytes);
        return JSONUtil.toBean(decryptStr, type);
    }
}