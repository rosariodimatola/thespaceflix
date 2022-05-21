package it.sps.main.services;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.sps.main.entities.Film;
import it.sps.main.repositories.FilmRepository;

@Service
public class FilmService {
	
	@Autowired
	private FilmRepository filmRepository;

	// TODO: Metodo che restituisce i film dell'ultimo mese
	public List<Film> ultimoMese(){
		return filmRepository.findByDataUscitaBetween(dataUltimoMese(), dataOdierna());	
	}
	
	public List<Film> tuttiIFilm(){
		return filmRepository.findAll();	
	}
	
	private Date dataUltimoMese() {
		ZonedDateTime localDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault()).minus(Period.ofDays(30));
		return gestSqlDate(localDateTime);
	}

	private Date dataOdierna() {
		ZonedDateTime localDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault());
		return gestSqlDate(localDateTime);
	}
	
	private Date gestSqlDate(ZonedDateTime localDateTime) {
		long millis = localDateTime.toInstant().toEpochMilli();
		return new Date(millis);
	}
	

}
