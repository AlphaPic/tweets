package com.fan.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author:fanwenlong
 * @date:2018-03-20 18:21:44
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;

    public Quote() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type=" + type + '\'' +
                ",value=" + value +
                '}';
    }
}
