package org.example.cleanarchitecture.main.script;

import org.example.cleanarchitecture.a.impl.AConfiguration;
import org.example.cleanarchitecture.b.impl.configurations.BScriptConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({AConfiguration.class, BScriptConfiguration.class})
public class ScriptMain {

    public static void main(String[] args) {
        SpringApplication.run(ScriptMain.class, args);
    }
}
