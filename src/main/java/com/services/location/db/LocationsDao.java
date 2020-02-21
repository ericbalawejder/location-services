package com.services.location.db;

import com.services.location.db.utils.LocationsMapper;
import com.services.location.model.Location;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterRowMapper(LocationsMapper.class)
public interface LocationsDao {

    // Get all locations from the DB
    @SqlQuery("SELECT * FROM locations")
    List<Location> getLocations();

}
