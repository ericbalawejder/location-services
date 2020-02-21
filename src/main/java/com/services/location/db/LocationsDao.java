package com.services.location.db;

import com.services.location.db.utils.LocationsMapper;
import com.services.location.model.Location;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

@RegisterRowMapper(LocationsMapper.class)
public interface LocationsDao {

    @SqlQuery("SELECT * FROM locations")
    List<Location> getLocations();

    @SqlQuery("SELECT * FROM locations WHERE id = :id")
    Location getLocation(@Bind("id") final int id);

    @SqlUpdate("INSERT INTO locations (`id`, `createdOn`, `modifiedOn`, `Country`, `State`, `Type`, `code`, `name`) " +
            "VALUES (:id, :createdOn, :modifiedOn, :country, :state, :type, :code, :name);")
    void insertLocation(@BindBean Location location);

    @SqlUpdate("UPDATE locations set name = coalesce(:name, name), code = coalesce(:code,code) where id = :id")
    void editLocation(@BindBean Location location);

    @SqlUpdate("DELETE FROM locations WHERE id = :id")
    int deleteLocation(@Bind("id") final int id);

}
