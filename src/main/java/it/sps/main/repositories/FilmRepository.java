package it.sps.main.repositories;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import it.sps.main.entities.Film;

public interface FilmRepository extends JpaRepository<Film, String> {
	
	//Query che restituisce i film che sono usciti al cinema in un intervallo di date
	List<Film> findByDataUscitaBetween(Date date, Date date2);
	
	//Query che restituisce la lista di tutti i film
	List<Film> findAll();
	
}
