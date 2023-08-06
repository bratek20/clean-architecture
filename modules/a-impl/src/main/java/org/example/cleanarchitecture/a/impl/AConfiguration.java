package org.example.cleanarchitecture.a.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfiguration {
    @Bean
    public AImpl a() {
        return new AImpl();
    }
}
