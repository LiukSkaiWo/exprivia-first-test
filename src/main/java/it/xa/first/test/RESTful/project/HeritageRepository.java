package it.xa.first.test.RESTful.project;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "heritage", path = "heritage")
public interface HeritageRepository extends PagingAndSortingRepository<Heritage, Long>, CrudRepository<Heritage,Long> {

    // /heritage/search/findByNameIs?name=
    List<Heritage> findByNameIs (@Param("name") String name);


}
