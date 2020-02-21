package com.services.location.db.utils;

import com.services.location.data.Country;
import com.services.location.data.State;
import com.services.location.data.Type;
import com.services.location.model.Location;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationsMapper implements RowMapper<Location> {

    @Override
    public Location map(ResultSet r, StatementContext ctx) throws SQLException {

        return new Location(
                r.getLong("id"),
                r.getString("createdOn"),
                r.getString("modifiedOn"),
                Country.valueOf(r.getString("Country")),
                State.valueOf(r.getString("State")),
                Type.valueOf(r.getString("Type")),
                r.getString("code"),
                r.getString("name")
        );
    }

}
