package org.example.spring.plugins.commons.utils;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.crypto.digest.DigestUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CompareUtils {
    public static boolean equals(Object data1, Object data2) {
        String sha256 = sha256(data1);
        String sha2561 = sha256(data2);
        return sha2561.equals(sha256);
    }

    public static String sha256(Object data) {
        try (
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        ) {
            objectOutputStream.writeObject(data);
            return DigestUtil.sha256Hex(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

}