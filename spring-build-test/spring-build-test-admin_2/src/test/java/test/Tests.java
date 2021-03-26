package test;

import cn.hutool.core.io.IoUtil;
import cn.hutool.crypto.SecureUtil;
import lombok.extern.slf4j.Slf4j;
import org.example.AdminTestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.*;

@SpringBootTest(classes = AdminTestApplication.class)
@Slf4j
public class Tests {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void test() throws FileNotFoundException {
//        PasswordEncoder passwordEncoder = SpringUtils.getBean(PasswordEncoder.class);
        String yuanenzhi = "yuanenzhi";
        String encode = passwordEncoder.encode("{bcrypt}" + yuanenzhi);
        System.out.println("encode = " + encode);
        encode = passwordEncoder.encode("{ldap}" + yuanenzhi);
        System.out.println("encode = " + encode);
        encode = passwordEncoder.encode("yuanenzhi");
        System.out.println("encode = " + encode);
//        String md5 = SecureUtil.md5(yuanenzhi);

    }

    @Test
    void t2() throws FileNotFoundException {
        extracted("D:\\IdeaProjects\\maven-projects\\spring-build-project-1\\spring-build-test\\spring-build-test-admin_1\\src\\main\\resources\\大屏界面(3).zip");
        extracted("D:\\IdeaProjects\\maven-projects\\spring-build-project-1\\spring-build-test\\spring-build-test-admin_1\\src\\main\\resources\\Data.zip");
        extracted("D:\\IdeaProjects\\maven-projects\\spring-build-project-1\\spring-build-test\\spring-build-test-admin_1\\src\\main\\resources\\recommended.yaml");

    }

    private void extracted(String s) throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(s)));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IoUtil.copy(bufferedInputStream, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        String md51 = SecureUtil.md5(bufferedInputStream);
        log.info("md51 = " + md51);
    }
}