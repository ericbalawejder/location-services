package com.services.location.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Country {

    US("United States of America", "US"),
    UK("United Kingdom", "GB");

    private String name;
    private String code;

    Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

}
