package br.com.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @Project govnetrh
 * Criado por @author Vinny Parker
 * em 23/09/2019
 */
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface CarRepository  extends JpaRepository<Car, Long> {
}
