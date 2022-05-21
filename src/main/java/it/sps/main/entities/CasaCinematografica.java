package it.sps.main.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "casecinematografiche")
public class CasaCinematografica extends EntitaGenerica {

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "partita_iva", nullable = false)
	private String partitaIva;
	
	@Column(name = "nazionalita", nullable = false)
	private String nazionalita;
	
	@OneToMany
	List<Attore> attori;
	
	@OneToMany
	List<Film> film;

	public CasaCinematografica() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public List<Attore> getAttori() {
		return attori;
	}

	public void setAttori(List<Attore> attori) {
		this.attori = attori;
	}

	public List<Film> getFilm() {
		return film;
	}

	public void setFilm(List<Film> film) {
		this.film = film;
	}
	
}
