package it.sps.main.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import it.sps.main.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
