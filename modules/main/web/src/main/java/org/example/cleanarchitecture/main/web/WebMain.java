package org.example.cleanarchitecture.main.web;

import org.example.cleanarchitecture.a.impl.AConfiguration;
import org.example.cleanarchitecture.b.impl.BConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AConfiguration.class, BConfiguration.class})
public class WebMain {

    public static void main(String[] args) {
        SpringApplication.run(WebMain.class, args);
    }
}
