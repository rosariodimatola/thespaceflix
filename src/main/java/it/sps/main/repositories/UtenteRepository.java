package it.sps.main.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import it.sps.main.entities.Utente;

public interface UtenteRepository extends JpaRepository<Utente, String> {

}
