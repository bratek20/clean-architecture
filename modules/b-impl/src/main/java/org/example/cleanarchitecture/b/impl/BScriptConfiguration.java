package org.example.cleanarchitecture.b.impl;

import lombok.RequiredArgsConstructor;
import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.shared.ScriptConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BScriptConfiguration extends ScriptConfiguration {

    private final AApi a;

    @Bean
    public BImpl b(AApi a) {
        return new BImpl(a);
    }

//    @Bean
//    public BController bController() {
//        return new BController();
//    }

    @Override
    public CommandLineRunner commandLineRunner() {
        return new BCommandLineRunner(a, b(a));
    }
}
