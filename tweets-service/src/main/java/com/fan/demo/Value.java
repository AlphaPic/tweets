package com.fan.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author:fanwenlong
 * @date:2018-03-20 18:23:05
 * @E-mail:alpha18603074401@gmail.com
 * @mobile:186-0307-4401
 * @description:
 * @detail:
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ",quote='" + quote + '\'' +
                "}";
    }
}
