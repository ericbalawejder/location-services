package com.services.location.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.services.location.data.Country;
import com.services.location.data.State;
import com.services.location.data.Type;

import java.util.Objects;

public class Location extends BaseEntity {

    private Country country;
    private State state;
    private Type type;
    private String code;
    private String name;

    public Location() {
    }

    public Location(long id, String createdOn, String modifiedOn, Country country,
                    State state, Type type, String code, String name) {
        super(id, createdOn, modifiedOn);
        this.country = country;
        this.state = state;
        this.type = type;
        this.code = code;
        this.name = name;
    }

    @JsonProperty(value = "Country")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty(value = "State")
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @JsonProperty(value = "Type")
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Location {" +
                "country = " + country +
                ", state = " + state +
                ", type = " + type +
                ", code = '" + code + '\'' +
                ", name = '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return country == location.country &&
                state == location.state &&
                type == location.type &&
                Objects.equals(code, location.code) &&
                Objects.equals(name, location.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, state, type, code, name);
    }

}
