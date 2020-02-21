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

    public Location getLocation(int id){
        return this.locationsDao.getLocation(id);
    }

    public void insertLocation(Location location){
        this.locationsDao.insertLocation(location);
    }

    public Location editLocation(Location location){
        this.locationsDao.editLocation(location);

        return this.locationsDao
                .getLocation(Integer.parseInt(String.valueOf(location.getId())));
    }

    public int deleteLocation(int id){
        return this.locationsDao.deleteLocation(id);
    }

}
