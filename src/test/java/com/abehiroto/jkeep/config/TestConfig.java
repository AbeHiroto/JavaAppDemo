package com.abehiroto.jkeep.config;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {
    @Bean
    public Clock testClock() {
        return Clock.fixed(Instant.now(), ZoneId.systemDefault());
    }
}