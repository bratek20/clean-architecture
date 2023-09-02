package org.example.cleanarchitecture.shared.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface ScriptConfiguration {
    @Bean
    CommandLineRunner commandLineRunner();
}
