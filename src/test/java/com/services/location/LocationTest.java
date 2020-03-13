package com.services.location;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.services.location.data.Country;
import com.services.location.data.State;
import com.services.location.data.Type;
import com.services.location.model.Location;
import io.dropwizard.jackson.Jackson;
import org.junit.jupiter.api.Test;
import static io.dropwizard.testing.FixtureHelpers.*;
import static org.assertj.core.api.Assertions.assertThat;


public class LocationTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void serializesToJSON() throws Exception {
        final Location location = new Location(
                3L, "1414602645000", "1414602645000",
                Country.US, State.ARIZONA, Type.UPS, "AZ", "desert");

        final String expected = MAPPER.writeValueAsString(
                MAPPER.readValue(fixture("fixtures/location.json"), Location.class));

        assertThat(MAPPER.writeValueAsString(location)).isEqualTo(expected);
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        final Location location = new Location(
                3L, "1414602645000", "1414602645000",
                Country.US, State.ARIZONA, Type.UPS, "AZ", "desert");

        assertThat(MAPPER.readValue(fixture("fixtures/location.json"), Location.class))
                .isEqualTo(location);
    }

}
