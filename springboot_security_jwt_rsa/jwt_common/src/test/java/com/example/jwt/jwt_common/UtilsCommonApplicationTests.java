package com.example.jwt.jwt_common;

import com.example.jwt.utils.RsaUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UtilsCommonApplicationTests {
    private String publicFile = "D:\\rsa_key.pub";
    private String privateFile = "D:\\rsa_key";
    @Test
    public void generateKey() throws Exception {
        RsaUtils.generateKey(publicFile, privateFile, "example", 2048);
    }
    @Test
    void contextLoads() {

    }

}
