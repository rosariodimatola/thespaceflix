package it.sps.main.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "attori")
public class Attore extends Persona {
	
	@Column(name = "oscar_vinti")
	private int oscarVinti;
	
	//@OneToMany (cascade = CascadeType.PERSIST)
	@ManyToMany (targetEntity=Film.class, cascade = CascadeType.PERSIST)
	@JoinColumn(name="film_id")
	private List<Film> film;

	public Attore() {
	}

	public int getOscarVinti() {
		return oscarVinti;
	}

	public void setOscarVinti(int oscarVinti) {
		this.oscarVinti = oscarVinti;
	}

	public List<Film> getFilm() {
		return film;
	}

	public void setFilm(List<Film> film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "Attore:" 
				+ "\n  nome: " + this.getNome()
				+ "\n  cognome: " + this.getCognome()
				+ "\n  data di nascita: " + this.getDataDiNascita()
				+ "\n  luogo di nascita: " + this.getLuogoDiNascita()
				+ "\n  nazionalità: " + this.getNazionalita()
				+ "\n  oscarVinti:" + oscarVinti 
				+ "\n\n";
	}

}
