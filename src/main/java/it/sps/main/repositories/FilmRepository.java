package it.sps.main.repositories;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import it.sps.main.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {
	
	//Query che restituisce i film che sono usciti al cinema in un intervallo di date
	List<Film> findByDataUscitaBetween(Date date, Date date2);
	
	@Override
	Optional<Film> findById(Long id);
	
	//Il findAll viene a gratis, già implementato dal repository
//	List<Film> findAll();
	
}
