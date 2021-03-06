package at.fh.ima.swengs.destinations.util;

/**
 * Created by Elza Karimova on 07.01.2017.
*/
import at.fh.ima.swengs.destinations.model.City;
import at.fh.ima.swengs.destinations.model.Sightseeing;
import at.fh.ima.swengs.destinations.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(User.class);
        config.exposeIdsFor(Sightseeing.class);
        config.exposeIdsFor(City.class);
    }
}

