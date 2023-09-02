package org.example.cleanarchitecture.b.impl.configurations;

import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.b.impl.BCommandLineRunner;
import org.example.cleanarchitecture.shared.configurations.ScriptConfiguration;
import org.springframework.boot.CommandLineRunner;

public class BScriptConfiguration extends BConfiguration implements ScriptConfiguration {

    public BScriptConfiguration(AApi a) {
        super(a);
    }

    @Override
    public CommandLineRunner commandLineRunner() {
        return new BCommandLineRunner(a, b(a));
    }
}
