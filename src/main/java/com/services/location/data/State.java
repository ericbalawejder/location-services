package com.services.location.data;

public enum State {

    ARIZONA("Arizona", "AZ"),
    COLORADO("Colorado", "CO");

    private String name;
    private String code;

    State(String name, String code) {
        this.name = name;
        this.code = code;
    }

}
