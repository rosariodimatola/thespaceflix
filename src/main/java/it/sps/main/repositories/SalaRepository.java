package it.sps.main.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import it.sps.main.entities.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long> {

	//Query che restituisce la lista di tutte le sale
	List<Sala> findAll();
}
