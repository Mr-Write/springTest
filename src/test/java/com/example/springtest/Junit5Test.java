package com.example.springtest;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("单元测试")
public class Junit5Test{
    @DisplayName("t1测试")
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS)
    @Test
    void t1() throws InterruptedException {
        Assumptions.assumeTrue(false,"结果不为true");

    }
}
