package org.example.cleanarchitecture;

import org.example.cleanarchitecture.a.impl.AConfiguration;
import org.example.cleanarchitecture.b.impl.BScriptConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AConfiguration.class, BScriptConfiguration.class})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
