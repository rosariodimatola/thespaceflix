package it.sps.main.services;

import utilities.sql.SqlDate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import it.sps.main.converters.Dto2FilmEager;
import it.sps.main.dtos.AttoreDto;
import it.sps.main.dtos.FilmDtoEager;
import it.sps.main.entities.Attore;
import it.sps.main.entities.Film;
import it.sps.main.repositories.FilmRepository;

@Service
@Transactional
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmRepository filmRepository;
	
	@Autowired
	private Converter<FilmDtoEager, Film> dto2FilmEager;


	// TODO: Metodo che restituisce i film dell'ultimo mese
	@Transactional
	public List<Film> listaFilmUltimoMese(){
		return filmRepository.findByDataUscitaBetween(dataUltimoMese(), dataOdierna());	
	}
	
	public List<Film> listaTuttiIFilm(){
		List<Film> listaFilm = filmRepository.findAll();
		return listaFilm;
	}
	
	public void addFilm (String dataUscita, int annoDiProduzione, double budgetFilm, double costoNoleggio, double costoBiglietto,
			String titoloFilm, double costoAcquisto) {
		
		Film film = new Film();
		Date dataUscitaFilm = SqlDate.getSqlDate(dataUscita);
		
		film.setAnnoProduzione(annoDiProduzione);
		film.setBudgetFilm(budgetFilm);
		film.setCostoAcquisto(costoAcquisto);
		film.setCostoNoleggio(costoNoleggio);
		film.setCostoBiglietto(costoBiglietto);
		film.setTitoloFilm(titoloFilm);
		film.setDataUscita(dataUscitaFilm);
		filmRepository.save(film);
	} 
	
	public void addFilmEager(FilmDtoEager filmDtoEager) {
//		log.info("Persisto l'attore {}", attoreDto);
//		List<Attore> listaAttori = new ArrayList<Attore>();
//		List<AttoreDto> listaAttoriDto = filmDtoEager.getAttoriDto();
//		
//		for (AttoreDto attoreDto : listaAttoriDto) {
//			Attore attore = dto2Attore.convert(attoreDto);
//			listaAttori.add(attore);
//		}
		
		Film film = dto2FilmEager.convert(filmDtoEager);
//		film.setAttori(listaAttori);
		//filmRepository.save(film);
	}
	
	public Date dataUltimoMese() {
		return SqlDate.getSqlDateFromSpecificBeforeNow(30);
	}

	public Date dataOdierna() {
		return SqlDate.getSqlDateFromSpecificBeforeNow(0);
	}
	
}
