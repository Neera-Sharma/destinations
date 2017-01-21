package at.fh.ima.swengs.destinations.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * http://docs.spring.io/spring-data/rest/docs/current/reference/html/
 */
@RepositoryRestResource //komme zu passengers
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
