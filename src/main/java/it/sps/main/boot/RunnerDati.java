package it.sps.main.boot;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import it.sps.main.entities.Attore;
import it.sps.main.entities.Film;
import it.sps.main.entities.Sala;
import it.sps.main.repositories.AttoreRepository;
import it.sps.main.repositories.FilmRepository;
import it.sps.main.repositories.SalaRepository;
import it.sps.main.services.AttoreService;
import it.sps.main.services.FilmService;
import it.sps.main.services.SalaService;

@Profile("dev")
@Component
public class RunnerDati implements CommandLineRunner {

	// Variabile utilizzata per effettuare le add sul database
	@Autowired
	private FilmRepository filmRepository;

	// Variabile utilizzata per effettuare le add sul database
	@Autowired
	private AttoreRepository attoreRepository;
	
	// Variabile utilizzata per effettuare le add sul database
	@Autowired
	private SalaRepository salaRepository;
	
	// Variabile che viene utilizzata per fare la stampa di prova dei metodi del repository
	@Autowired
	FilmService filmService;
	
	// Variabile che viene utilizzata per fare la stampa di prova dei metodi del repository
	@Autowired
	AttoreService attoreService;
	
	// Variabile che viene utilizzata per fare la stampa di prova dei metodi del repository
	@Autowired
	SalaService salaService;
	
	private Date getSqlDate (String data) {
		String dataDaConvertire = data + " 00:00:00";
		LocalDateTime localDateTime = LocalDateTime.parse(dataDaConvertire,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss") );
		long millis = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
		return new Date(millis);
	}
	
	private void addFilm (String dataUscita, int annoDiProduzione, double budgetFilm, double costoNoleggio, double costoBiglietto,
			String titoloFilm, double costoAcquisto) {
		
		Film film = new Film();
		
		film.setAnnoProduzione(annoDiProduzione);
		film.setBudgetFilm(budgetFilm);
		film.setCostoAcquisto(costoAcquisto);
		film.setCostoNoleggio(costoNoleggio);
		film.setCostoBiglietto(costoBiglietto);
		film.setTitoloFilm(titoloFilm);
		film.setDataUscita(getSqlDate(dataUscita));
		filmRepository.save(film);
	}
	
	private void addAttore(String nome, String cognome, String dataDiNascita, String luogoDiNascita, String nazionalita, int oscarVinti) {
		
		Attore attore = new Attore();
		
		attore.setNome(nome);
		attore.setCognome(cognome);
		attore.setDataDiNascita(getSqlDate(dataDiNascita));
		attore.setLuogoDiNascita(luogoDiNascita);
		attore.setNazionalita(nazionalita);
		attore.setOscarVinti(oscarVinti);
		attoreRepository.save(attore);
	}
	
	private void addSala(String nome, String indirizzo, int numeroPosti, String tipo) {
		
		Sala sala = new Sala();
		
		sala.setNomeSala(nome);
		sala.setIndirizzoSala(indirizzo);
		sala.setNumeroPostiSala(numeroPosti);
		sala.setTipoSala(tipo);
		salaRepository.save(sala);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		this.addFilm("2022/01/30", 2022, 10000, 5, 8, "Film 1", 10);
		this.addFilm("2021/12/20", 2021, 20000, 5, 8, "Film 2", 5);
		this.addFilm("2023/06/04", 2023, 550000, 6, 9, "Film 3", 12);
		this.addFilm("2023/04/30", 2022, 40000, 7, 2, "Film 4", 10);
		this.addFilm("2022/04/28", 2022, 50000, 7, 2, "Film 5", 10);
		this.addFilm("2022/05/16", 2021, 348000, 7, 2, "Film 6", 10);
		
		this.addAttore("Nome 1", "Cognome 1", "1975/12/10", "New York", "Americana", 3);
		this.addAttore("Nome 2", "Cognome 2", "1980/04/18", "Roma", "Italiana", 0);
		this.addAttore("Nome 3", "Cognome 3", "1958/01/03", "Zurigo", "Svizzera", 1);
		
		this.addSala("Sala 1", "Indirizzo 1", 100, "mall");
		this.addSala("Sala 2", "Indirizzo 2", 20, "small");
		this.addSala("Sala 3", "Indirizzo 3", 10, "small");
		this.addSala("Sala 4", "Indirizzo 3", 250, "mall");
		
		
//		System.out.println("Lista di tutti i film dell'ultimo mese");
//		System.out.println(filmService.ultimoMese());
		
//		System.out.println("Tutti i film presente nel sito");
//		System.out.println(filmService.tuttiIFilm());
		
//		System.out.println("\n\n");
//		System.out.println("Lista di tutti gli attori presenti nel sito");
//		System.out.println(attoreService.tuttiGliAttori());
		
		System.out.println("\n\n");
		System.out.println("Lista di tutte le sale presenti nel sito");
		System.out.println(salaService.tutteLeSale());
	}

	
}
