package it.sps.main.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import it.sps.main.entities.Noleggio;

public interface NoleggioRepository extends JpaRepository<Noleggio, String> {

}
