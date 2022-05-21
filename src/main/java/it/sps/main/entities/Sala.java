package it.sps.main.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "sale")
public class Sala extends EntitaGenerica{
	

	@Column(name = "nome_sala", nullable = false)
	private String nomeSala;
	
	@Column(name = "indirizzo_sala", nullable = false)
	private String indirizzoSala;
	
	@Column(name = "numero_posti_sala", nullable = false)
	private int numeroPostiSala;
	
	@Column(name = "tipo_sala", nullable = false)
	private String tipoSala; // Deve diventare ENUM dopo lezione di Antonio
	
	public Sala(){}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public String getIndirizzoSala() {
		return indirizzoSala;
	}

	public void setIndirizzoSala(String indirizzoSala) {
		this.indirizzoSala = indirizzoSala;
	}

	public int getNumeroPostiSala() {
		return numeroPostiSala;
	}

	public void setNumeroPostiSala(int numeroPostiSala) {
		this.numeroPostiSala = numeroPostiSala;
	}

	public String getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}

	@Override
	public String toString() {
		return "\nSala:" 
				+ "\n  nomeSala=" + nomeSala 
				+ "\n  indirizzoSala=" + indirizzoSala 
				+ "\n  numeroPostiSala=" + numeroPostiSala 
				+ "\n  tipoSala=" + tipoSala 
				+ "\n";
	}

}
