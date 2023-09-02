package org.example.cleanarchitecture.b.impl.configurations;

import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.b.impl.BController;
import org.example.cleanarchitecture.shared.configurations.WebConfiguration;
import org.springframework.context.annotation.Bean;

public class BWebConfiguration extends BConfiguration implements WebConfiguration {

    public BWebConfiguration(AApi a) {
        super(a);
    }

    @Bean
    public BController bController() {
        return new BController();
    }
}
