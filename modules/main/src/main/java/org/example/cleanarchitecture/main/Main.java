package org.example.cleanarchitecture.main;

import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.a.impl.AConfiguration;
import org.example.cleanarchitecture.b.api.BApi;
import org.example.cleanarchitecture.b.impl.BConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({AConfiguration.class, BConfiguration.class})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AApi a, BApi b) {
        return args -> {
            System.out.println("A value: " + a.getValue());
            System.out.println("B value: " + b.getValue());
        };
    }
}
