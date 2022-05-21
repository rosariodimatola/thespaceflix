package it.sps.main.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "proiezioni")
public class Proiezione extends EntitaGenerica {
	
	@Column(name = "data_proiezione", nullable = false)
	private Date dataProiezione;
	
	@OneToOne (cascade = CascadeType.PERSIST)
	private Sala sala;
	
	@OneToOne (cascade = CascadeType.PERSIST)
	private Film film;
	
	public Proiezione() {}

	public Date getDataProiezione() {
		return dataProiezione;
	}

	public void setDataProiezione(Date dataProiezione) {
		this.dataProiezione = dataProiezione;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

}
