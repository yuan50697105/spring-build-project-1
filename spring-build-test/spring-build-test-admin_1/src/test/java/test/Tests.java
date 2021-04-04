package test;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.json.JSONUtil;
import org.example.modules.repository.mysql.table.po.TUser;
import org.example.plugins.commons.entity.DataDTO;
import org.example.plugins.commons.utils.RSAAESUtils;
import org.example.plugins.commons.utils.RSADESUtils;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Tests {
    @Test
    void t1() {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        Date date = new Date(currentTimeMillis);
        System.out.println("date = " + date);
        String format = DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println("format = " + format);
        String format1 = DateUtil.format(date, "yyyy-MM-dd hh:mm:ss aa");
        System.out.println("format1 = " + format1);
    }

    @Test
    void t2() {
        String content = "hljkhjklhglghjlkhgiyuhuhilhghgfkfgf;h;";
        byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();
        AES aes = SecureUtil.aes(key);
        RSA rsa = SecureUtil.rsa();
        System.out.println("rsa.getPrivateKeyBase64() = " + rsa.getPrivateKeyBase64());
        System.out.println("rsa.getPublicKeyBase64() = " + rsa.getPublicKeyBase64());
        byte[] encrypt1 = aes.encrypt(content);
        byte[] encrypt = rsa.encrypt(key, KeyType.PrivateKey);
        System.out.println("encrypt.length = " + encrypt.length);
        System.out.println("encrypt1.length = " + encrypt1.length);
        byte[] bytes = new byte[encrypt.length + encrypt1.length];
        System.out.println("bytes.length = " + bytes.length);
        System.arraycopy(encrypt, 0, bytes, 0, encrypt.length);
        System.arraycopy(encrypt1, 0, bytes, encrypt.length, encrypt1.length);
        String encode = Base64.encode(bytes);
        System.out.println("encode = " + encode);
        byte[] decode = Base64.decode(encode);
        int length = decode.length - 128;
        System.out.println("length = " + length);
        byte[] bytes1 = new byte[128];
        byte[] bytes2 = new byte[length];
        System.arraycopy(decode, 0, bytes1, 0, 128);
        System.arraycopy(decode, 128, bytes2, 0, length);
        byte[] decrypt = rsa.decrypt(bytes1, KeyType.PublicKey);
        String decryptStr = SecureUtil.aes(decrypt).decryptStr(bytes2);
        System.out.println("decryptStr = " + decryptStr);
    }

    @Test
    void t3() {
        TUser data = new TUser();
        data.setUsername("原唔知");
        data.setName("一二三四");
        DataDTO encrypt = RSAAESUtils.encrypt(data);
        System.out.println("JSONUtil.toJsonPrettyStr(encrypt) = " + JSONUtil.toJsonPrettyStr(encrypt));
        TUser decrypt = RSAAESUtils.decrypt(encrypt, TUser.class);
        System.out.println("decrypt = " + decrypt);
    }

    @Test
    void t4() {
        TUser data = new TUser();
        data.setUsername("原唔知");
        data.setName("一二三四");
        DataDTO encrypt = RSADESUtils.encrypt(data);
        System.out.println("JSONUtil.toJsonPrettyStr(encrypt) = " + JSONUtil.toJsonPrettyStr(encrypt));
        TUser decrypt = RSADESUtils.decrypt(encrypt, TUser.class);
        System.out.println("decrypt = " + decrypt);
    }
}