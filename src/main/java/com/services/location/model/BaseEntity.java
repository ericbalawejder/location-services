package com.services.location.model;

public class BaseEntity {

    private long id;
    private String createdOn;
    private String modifiedOn;

    public BaseEntity() {
    }

    public BaseEntity(long id, String createdOn, String modifiedOn) {
        this.id = id;
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

}
