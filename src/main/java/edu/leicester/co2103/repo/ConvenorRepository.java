package edu.leicester.co2103.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.leicester.co2103.domain.Convenor;

@Repository
public interface ConvenorRepository extends CrudRepository<Convenor, Long> {

}
