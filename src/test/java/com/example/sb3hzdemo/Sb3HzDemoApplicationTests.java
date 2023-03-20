package com.example.sb3hzdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class Sb3HzDemoApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertDoesNotThrow(() -> log.info("context loads"));
    }
}
