package org.example.cleanarchitecture.b.impl;

import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.b.api.BApi;

public class BImpl implements BApi {
    private final AApi a;

    public BImpl(AApi a) {
        this.a = a;
        System.out.println("BImpl created");
    }

    @Override
    public String getValue() {
        return "b and a value: " + a.getValue();
    }
}
