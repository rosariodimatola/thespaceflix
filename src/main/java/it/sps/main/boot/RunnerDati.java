package it.sps.main.boot;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import it.sps.main.dtos.AttoreDto;
import it.sps.main.dtos.FilmDtoEager;
import it.sps.main.dtos.FilmDtoSlim;
import it.sps.main.services.AttoreService;
import it.sps.main.services.FilmServiceImpl;
import it.sps.main.services.SalaService;
import utilities.sql.SqlDate;

@Profile("dev")
@Component
public class RunnerDati implements CommandLineRunner {

	// Variabile che viene utilizzata per fare la stampa di prova dei metodi del repository
	@Autowired
	FilmServiceImpl filmService;
	
	// Variabile che viene utilizzata per fare la stampa di prova dei metodi del repository
	@Autowired
	AttoreService attoreService;
	
	// Variabile che viene utilizzata per fare la stampa di prova dei metodi del repository
	@Autowired
	SalaService salaService;
	
	@Override
	public void run(String... args) throws Exception {
		
		AttoreDto attoreDto = AttoreDto.builder().withCognome("Cognome Aggiornato")
								.withId(3L)
								.withNome("Nome Aggiornato 4")
								.withDataDiNascita(new java.util.Date())
								.withEta(20)
								.withLuogoDiNascita("Luogo Aggiornato 4")
								.withOscarVinti(1)
								.withNazionalita("Tedesca")
								.build();
		
		attoreService.addAttore(attoreDto);
		//attoreService.updateAttore(attoreDto);
		List<AttoreDto> listaAttoriDto = new ArrayList<AttoreDto>();
		
		listaAttoriDto.add(attoreDto);
		//System.out.println(listaAttoriDto.get(0));
		
		
		
		FilmDtoEager filmDtoEager = FilmDtoEager.builder().withAnnoProduzione(2015)
							.withTitoloFilm("Film 1")
							.withBudgetFilm(500000)
							.withCostoAcquisto(15)
							.withCostoBiglietto(8)
							.withCostoNoleggio(5)
							.withDataUscita(SqlDate.getSqlDate("2016/06/15"))
							.withImmagine("Immagine")
							.withQuantitaNoleggioAcquistoDvd(10)
							.withTrama("Trama")
							.withAttoriDto(listaAttoriDto)
							.build();
		
		
		filmService.addFilmEager(filmDtoEager);
	
		
		/*filmService.addFilm("2022/01/30", 2022, 10000, 5, 8, "Film 1", 10);
		filmService.addFilm("2021/12/20", 2021, 20000, 5, 8, "Film 2", 5);
		filmService.addFilm("2023/06/04", 2023, 550000, 6, 9, "Film 3", 12);
		filmService.addFilm("2023/04/30", 2022, 40000, 7, 2, "Film 4", 10);
		filmService.addFilm("2022/04/28", 2022, 50000, 7, 2, "Film 5", 10);
		filmService.addFilm("2022/05/16", 2021, 348000, 7, 2, "Film 6", 10);
		
		attoreService.addAttore("Nome 1", "Cognome 1", "1975/12/10", "New York", "Americana", 3);
		attoreService.addAttore("Nome 1", "Cognome 1", "1975/12/10", "New York", "Americana", 3);
		attoreService.addAttore("Nome 2", "Cognome 2", "1980/04/18", "Roma", "Italiana", 0);
		attoreService.addAttore("Nome 3", "Cognome 3", "1958/01/03", "Zurigo", "Svizzera", 1);
		
		salaService.addSala("Sala 1", "Indirizzo 1", 100, "mall");
		salaService.addSala("Sala 2", "Indirizzo 2", 20, "small");
		salaService.addSala("Sala 3", "Indirizzo 3", 10, "small");
		salaService.addSala("Sala 4", "Indirizzo 3", 250, "mall");
		
		
		System.out.println("Lista di tutti i film dell'ultimo mese");
		System.out.println(filmService.listaFilmUltimoMese());
		
		System.out.println("Tutti i film presente nel sito");
		System.out.println(filmService.listaTuttiIFilm());
		
		System.out.println("\n\n");
		System.out.println("Lista di tutti gli attori presenti nel sito");
		System.out.println(attoreService.listaTuttiGliAttori());
		
		System.out.println("\n\n");
		System.out.println("Lista di tutte le sale presenti nel sito");
		System.out.println(salaService.tutteLeSale());
		*/
	}

	
}
