package com.services.location.api.resources;

import com.services.location.business.services.LocationsService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/v1/locations")
@Consumes(MediaType.APPLICATION_JSON + "; charset=UTF-8")
@Produces(MediaType.APPLICATION_JSON)
public class LocationsResource {

    private LocationsService locationsService;

    public LocationsResource(final LocationsService locationService) {
        this.locationsService = locationService;
    }

    // Get all locations from the DB
    @GET
    public Response getLocations() {
        return Response.ok().entity(this.locationsService.getLocations()).build();
    }

}
