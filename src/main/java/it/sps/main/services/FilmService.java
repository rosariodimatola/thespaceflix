package it.sps.main.services;

import java.sql.Date;
import java.util.List;

import it.sps.main.dtos.FilmDtoEager;
import it.sps.main.dtos.FilmDtoSlim;
import it.sps.main.entities.Film;

public interface FilmService {
	
	List<Film> listaFilmUltimoMese();	
	
	List<Film> listaTuttiIFilm();
	
	FilmDtoSlim searchFilmForId(Long id);
	
	List<FilmDtoSlim> listAllFilmForWeb();
	
	void addFilm (String dataUscita, int annoDiProduzione, double budgetFilm, double costoNoleggio, double costoBiglietto,
			String titoloFilm, double costoAcquisto); 
	
	void addFilm (FilmDtoSlim film);
	
	void addFilmEager(FilmDtoEager filmDtoEager);
	
	void deleteFilm(FilmDtoSlim film);
	
	void deleteFilmById(Long id);

	Date dataUltimoMese();

	Date dataOdierna();

}
