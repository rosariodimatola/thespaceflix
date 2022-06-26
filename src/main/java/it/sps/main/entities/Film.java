package it.sps.main.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "film")
public class Film extends EntitaGenerica {
	
	@Column(name = "titolo_film", nullable = false)
	private String titoloFilm;
	
	@Column(name = "budget_film")
	private double budgetFilm;
	
	@Column(name = "costo_noleggio")
	private double costoNoleggio;
	
	@Column(name = "costo_acquisto")
	private double costoAcquisto;
	
	@Column(name = "costo_biglietto")
	private double costoBiglietto;
	
	@Column(name = "quantita_noleggio_acquisto_dvd")
	private int quantitaNoleggioAcquistoDvd;
	
	@Column(name = "data_uscita")
	private Date dataUscita;
	
	@Column(name = "anno_produzione")
	private int annoProduzione;
	
	@Column(name = "link_immagine")
	private String immagine;
	
	@Column(name = "trama")
	private String trama;
	
	//@OneToMany (cascade = CascadeType.PERSIST)
	@ManyToMany (targetEntity=Attore.class, cascade = CascadeType.PERSIST)
	@JoinColumn(name="attore_id")
	private List<Attore> attori;
	
	
	//Creare classe registra che estende persona e ha relazione onetomany con films
	
	
	public Film() {}

	public String getTitoloFilm() {
		return titoloFilm;
	}

	public void setTitoloFilm(String titoloFilm) {
		this.titoloFilm = titoloFilm;
	}

	public double getBudgetFilm() {
		return budgetFilm;
	}

	public void setBudgetFilm(double budgetFilm) {
		this.budgetFilm = budgetFilm;
	}

	public double getCostoNoleggio() {
		return costoNoleggio;
	}

	public void setCostoNoleggio(double costoNoleggio) {
		this.costoNoleggio = costoNoleggio;
	}

	public double getCostoAcquisto() {
		return costoAcquisto;
	}

	public void setCostoAcquisto(double costoAcquisto) {
		this.costoAcquisto = costoAcquisto;
	}

	public double getCostoBiglietto() {
		return costoBiglietto;
	}

	public void setCostoBiglietto(double costoBiglietto) {
		this.costoBiglietto = costoBiglietto;
	}

	public int getQuantitaNoleggioAcquistoDvd() {
		return quantitaNoleggioAcquistoDvd;
	}

	public void setQuantitaNoleggioAcquistoDvd(int quantitaNoleggioAcquistoDvd) {
		this.quantitaNoleggioAcquistoDvd = quantitaNoleggioAcquistoDvd;
	}

	public Date getDataUscita() {
		return dataUscita;
	}

	public void setDataUscita(Date dataUscita) {
		this.dataUscita = dataUscita;
	}

	public int getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}
	
	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public List<Attore> getAttori() {
		return attori;
	}

	public void setAttori(List<Attore> attori) {
		this.attori = attori;
	}

	@Override
	public String toString() {
		return "Film: \n"
				+ "  titoloFilm=" + titoloFilm 
				+ "\n  budgetFilm=" + budgetFilm 
				+ "\n  costoNoleggio=" + costoNoleggio
				+ "\n  costoAcquisto=" + costoAcquisto 
				+ "\n  costoBiglietto=" + costoBiglietto
				+ "\n  quantitaNoleggioAcquistoDvd=" + quantitaNoleggioAcquistoDvd 
				+ "\n  dataUscita=" + dataUscita
				+ "\n  annoProduzione=" + annoProduzione 
				+ "\n\n";
	}
}

