package com.epam.esm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ServiceApplication.class)
@ActiveProfiles("test")
class ServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
