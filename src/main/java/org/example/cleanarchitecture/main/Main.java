package org.example.cleanarchitecture.main;

import org.example.cleanarchitecture.a.api.AApi;
import org.example.cleanarchitecture.a.impl.AImpl;
import org.example.cleanarchitecture.b.impl.BImpl;


public class Main {

    public static void main(String[] args) {
        AApi a = create();
        System.out.println("A value: " + a.getValue());

        BImpl b = new BImpl(a);
        System.out.println("B value: " + b.getValue());
    }

    private static AApi create() {
        return new AImpl();
    }
}