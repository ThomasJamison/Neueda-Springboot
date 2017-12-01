package uk.ac.belfastmet.dwarfs.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer>
{

	Iterable<Dwarf> findByAuthor(String string);

	Iterable<Dwarf> findTop3ByAuthor(String string);
	
	Iterable<Dwarf> findByName(String string);
	
	Iterable<Dwarf> findByDwarfId(Integer integer);
	
	Iterable<Dwarf> findByOrderByName();
	
	Iterable<Dwarf> findByAuthorOrName(String string, String string1);

}
