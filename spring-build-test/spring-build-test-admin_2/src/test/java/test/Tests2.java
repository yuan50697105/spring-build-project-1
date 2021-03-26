package test;

import cn.hutool.core.io.IoUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.MD5;
import lombok.extern.slf4j.Slf4j;
import org.example.AdminTestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.*;

@Slf4j
public class Tests2 {

    @Test
    void t2() throws FileNotFoundException {
        extracted("D:\\IdeaProjects\\maven-projects\\spring-build-project-1\\spring-build-test\\spring-build-test-admin_1\\src\\main\\resources\\大屏界面(3).zip");
        extracted("D:\\IdeaProjects\\maven-projects\\spring-build-project-1\\spring-build-test\\spring-build-test-admin_1\\src\\main\\resources\\Data.zip");
        extracted("D:\\IdeaProjects\\maven-projects\\spring-build-project-1\\spring-build-test\\spring-build-test-admin_1\\src\\main\\resources\\recommended.yaml");

    }

    private void extracted(String s) throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(s));
        FileInputStream fileInputStream = new FileInputStream(s);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IoUtil.copy(fileInputStream, byteArrayOutputStream);
        FileInputStream fileInputStream1 = new FileInputStream(s);
        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        byte[] bytes = byteArrayOutputStream.toByteArray();
        IoUtil.copy(fileInputStream1, byteArrayOutputStream1);
        byte[] bytes1 = byteArrayOutputStream1.toByteArray();
        MD5 md5 = MD5.create();
        String hex16 = md5.digestHex16(fileInputStream);
        log.info("hex16 = " + hex16);
        String hex161 = md5.digestHex16(bytes);
        log.info("hex161 = " + hex161);
        String hex162 = md5.digestHex16(bytes1);
        log.info("hex162 = " + hex162);

    }
}