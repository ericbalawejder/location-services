package com.services.location.data;

public enum Type {

    AMAZON("Amazon", "AMZ"),
    UPS("Ups", "UPS");

    private String name;
    private String code;

    Type(String name, String code) {
        this.name = name;
        this.code = code;
    }

}
