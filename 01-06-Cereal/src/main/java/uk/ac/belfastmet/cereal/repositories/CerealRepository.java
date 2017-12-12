package uk.ac.belfastmet.cereal.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereal.domain.BreakfastCereal;


public interface CerealRepository extends CrudRepository<BreakfastCereal, Integer> 
{

}