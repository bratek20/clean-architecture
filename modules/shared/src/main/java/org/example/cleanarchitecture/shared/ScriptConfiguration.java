package org.example.cleanarchitecture.shared;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public abstract class ScriptConfiguration {
    @Bean
    public abstract CommandLineRunner commandLineRunner();
}
