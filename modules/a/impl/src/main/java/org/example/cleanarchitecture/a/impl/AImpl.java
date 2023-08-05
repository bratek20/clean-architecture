package org.example.cleanarchitecture.a.impl;

import org.example.cleanarchitecture.a.api.AApi;

public class AImpl implements AApi {

    @Override
    public String getValue() {
        return "hej";
    }
}
