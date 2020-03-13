package com.services.location;

import com.services.location.api.resources.LocationsResource;
import com.services.location.business.services.LocationsService;
import com.services.location.data.Country;
import com.services.location.data.State;
import com.services.location.data.Type;
import com.services.location.model.Location;
import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class LocationResourceTest {

    private static final LocationsService dao = mock(LocationsService.class);

    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new LocationsResource(dao))
            .build();

    final Location location = new Location(
            3L, "1414602645000", "1414602645000",
            Country.US, State.ARIZONA, Type.UPS, "AZ", "desert");

    final List<Location> locations = new ArrayList<>(Collections.singleton(location));

    @BeforeEach
    public void setup() {
        when(dao.getLocations()).thenReturn(locations);
    }

    @AfterEach
    public void tearDown(){
        // we have to reset the mock after each test because of the
        // @ClassRule, or use a @Rule as mentioned below.
        reset(dao);
    }

    @Disabled
    @Test
    public void testGetLocations() {
        assertThat(resources.target("/api/v1/locations")
                .request()
                .get(Location.class))
                .isEqualTo(location);

        verify(dao).getLocations();
    }
}
