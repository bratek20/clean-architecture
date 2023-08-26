package org.example.cleanarchitecture.b.impl;

import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.b.api.BApi;
import org.springframework.boot.CommandLineRunner;

public class BCommandLineRunner implements CommandLineRunner {
    private AApi a;
    private BApi b;

    public BCommandLineRunner(AApi a, BApi b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run(String... args) {
        System.out.println("A value: " + a.getValue());
        System.out.println("B value: " + b.getValue());
    };
}
