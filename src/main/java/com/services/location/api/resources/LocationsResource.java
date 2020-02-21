package com.services.location.api.resources;

import com.services.location.business.services.LocationsService;
import com.services.location.model.Location;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

    @GET
    public Response getLocations() {
        return Response.ok().entity(this.locationsService.getLocations()).build();
    }

    @GET
    @Path("{id}")
    public Response getLocation(@PathParam("id") final int id) {
        return Response.ok().entity(this.locationsService.getLocation(id)).build();
    }

    @POST
    public Response insertLocation(final @NotNull Location location) {
        this.locationsService.insertLocation(location);
        return Response.ok().build();
    }

    @PUT
    @Path("{id}")
    public Response editLocation(final @NotNull Location location, @PathParam("id") final int id) {
        return Response.ok().entity(this.locationsService.editLocation(location)).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteLocation(@PathParam("id") final int id) {
        return Response.ok().entity(this.locationsService.deleteLocation(id)).build();
    }

}
