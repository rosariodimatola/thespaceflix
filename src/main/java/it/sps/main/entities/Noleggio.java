package it.sps.main.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "noleggi")
public class Noleggio extends EntitaGenerica {
	
	@OneToOne
	private Utente utente;
	
	@OneToMany
	private List<Film> film;
	
	public Noleggio() {}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public List<Film> getFilm() {
		return film;
	}

	public void setFilm(List<Film> film) {
		this.film = film;
	}
	
}
