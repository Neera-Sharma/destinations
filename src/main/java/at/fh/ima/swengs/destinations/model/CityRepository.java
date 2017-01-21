package at.fh.ima.swengs.destinations.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 http://docs.spring.io/spring-data/rest/docs/current/reference/html/
 */

@RepositoryRestResource
public interface CityRepository extends PagingAndSortingRepository<City, Long> {
}