package com.example.auth_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class AuthServerApplicationTests {

    @Test
    void contextLoads() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123");
        System.out.println(encode);
        boolean matches = bCryptPasswordEncoder.matches("123", "$2a$10$fcgIhvn0HPnnhDnn2WWtNej2ReBii0vPotQHjmDRFhWUetYlAx/mK");
        System.out.println(matches);
    }

}
