package test;

import org.example.AdminTestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(classes = AdminTestApplication.class)
public class Tests {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void test() {
//        PasswordEncoder passwordEncoder = SpringUtils.getBean(PasswordEncoder.class);
        String encode = passwordEncoder.encode("{bcrypt}yuanenzhi");
        System.out.println("encode = " + encode);
    }
}