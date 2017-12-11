package uk.ac.belfastmet.titanic.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Passenger;


public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

}
