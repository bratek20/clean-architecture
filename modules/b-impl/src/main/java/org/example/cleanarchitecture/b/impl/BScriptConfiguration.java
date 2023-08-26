package org.example.cleanarchitecture.b.impl;

import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.shared.ScriptConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BScriptConfiguration extends ScriptConfiguration {

    @Bean
    public BImpl b(AApi a) {
        return new BImpl(a);
    }

    @Override
    public CommandLineRunner commandLineRunner() {
        return new BCommandLineRunner();
    }
}
