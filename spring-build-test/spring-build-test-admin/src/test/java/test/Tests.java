package test;

import ai.yue.library.base.util.SpringUtils;
import org.example.AdminTestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(classes = AdminTestApplication.class)
public class Tests {
    @Test
    void test() {
        PasswordEncoder passwordEncoder = SpringUtils.getBean(PasswordEncoder.class);
        String encode = passwordEncoder.encode("{bcrypt}yuanenzhi");
        System.out.println("encode = " + encode);
    }
}