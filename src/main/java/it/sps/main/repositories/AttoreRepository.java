package it.sps.main.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import it.sps.main.entities.Attore;

public interface AttoreRepository extends JpaRepository<Attore, String> {

	//Query che restituisce la lista di tutti gli attori
	List<Attore> findAll();
}
