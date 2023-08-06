package org.example.cleanarchitecture.b.impl;

import org.example.cleanarchitecture.a.api.AApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConfiguration {

    @Bean
    public BImpl b(AApi a) {
        return new BImpl(a);
    }
}
