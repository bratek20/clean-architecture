package org.example.cleanarchitecture.b.impl.configurations;

import lombok.RequiredArgsConstructor;
import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.b.impl.BImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BConfiguration {

    protected final AApi a;

    @Bean
    public BImpl b(AApi a) {
        return new BImpl(a);
    }
}
