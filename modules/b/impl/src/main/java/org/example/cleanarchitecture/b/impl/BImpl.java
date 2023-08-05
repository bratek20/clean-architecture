package org.example.cleanarchitecture.b.impl;

import org.example.cleanarchitecture.a.api.AApi;

public class BImpl {
    private final AApi a;

    public BImpl(AApi a) {
        this.a = a;
    }

    public String myValue() {
        return "b and a value: " + a.getValue();
    }
}
