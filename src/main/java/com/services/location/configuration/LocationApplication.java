package com.services.location.configuration;

import com.services.location.api.resources.LocationsResource;
import com.services.location.business.services.LocationsService;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

public class LocationApplication extends Application<LocationConfiguration> {

    public static void main(String[] args) throws Exception {
        new LocationApplication().run(args);
    }

    @Override
    public void run(LocationConfiguration configuration, Environment environment) throws Exception {
        System.out.println("Location Services Application");
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
        environment.jersey().register(new LocationsResource(new LocationsService()));
    }
}
