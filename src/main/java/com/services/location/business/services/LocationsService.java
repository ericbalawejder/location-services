package com.services.location.business.services;

import com.services.location.db.LocationsDao;
import com.services.location.model.Location;

import java.util.List;

public class LocationsService {

    private LocationsDao locationsDao;

    public LocationsService(final LocationsDao locationsDao){
        this.locationsDao = locationsDao;
    }

    public List<Location> getLocations(){
        return this.locationsDao.getLocations();
    }

}
