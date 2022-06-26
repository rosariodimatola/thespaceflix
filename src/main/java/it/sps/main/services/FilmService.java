package it.sps.main.services;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import it.sps.main.dtos.FilmDtoEager;
import it.sps.main.entities.Film;
import utilities.sql.SqlDate;

public interface FilmService {
	
	List<Film> listaFilmUltimoMese();	
	
	List<Film> listaTuttiIFilm();
	
	void addFilm (String dataUscita, int annoDiProduzione, double budgetFilm, double costoNoleggio, double costoBiglietto,
			String titoloFilm, double costoAcquisto); 
	
	void addFilmEager(FilmDtoEager filmDtoEager);

	Date dataUltimoMese();

	Date dataOdierna();

}
