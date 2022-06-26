package it.sps.main.dtos;

import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.BeanUtils;

import java.util.Collections;

public class FilmDtoEager {
	
	private String titoloFilm;

	private double budgetFilm;
	
	private double costoNoleggio;
	
	private double costoAcquisto;
	
	private double costoBiglietto;
	
	private int quantitaNoleggioAcquistoDvd;
	
	private Date dataUscita;
	
	private int annoProduzione;
	
	private String immagine;
	
	private String trama;
	
	private List<AttoreDto> attoriDto;

	@Generated("SparkTools")
	private FilmDtoEager(Builder builder) {
		BeanUtils.copyProperties(builder, this);
	}

	public String getTitoloFilm() {
		return titoloFilm;
	}

	public void setTitoloFilm(String titoloFilm) {
		this.titoloFilm = titoloFilm;
	}

	public List<AttoreDto> getAttoriDto() {
		return attoriDto;
	}

	public void setAttoriDto(List<AttoreDto> attoriDto) {
		this.attoriDto = attoriDto;
	}
	
	public FilmDtoEager() {
		super();
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

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String titoloFilm;
		private double budgetFilm;
		private double costoNoleggio;
		private double costoAcquisto;
		private double costoBiglietto;
		private int quantitaNoleggioAcquistoDvd;
		private Date dataUscita;
		private int annoProduzione;
		private String immagine;
		private String trama;
		private List<AttoreDto> attoriDto = Collections.emptyList();

		private Builder() {
		}

		public Builder withTitoloFilm(String titoloFilm) {
			this.titoloFilm = titoloFilm;
			return this;
		}

		public Builder withBudgetFilm(double budgetFilm) {
			this.budgetFilm = budgetFilm;
			return this;
		}

		public Builder withCostoNoleggio(double costoNoleggio) {
			this.costoNoleggio = costoNoleggio;
			return this;
		}

		public Builder withCostoAcquisto(double costoAcquisto) {
			this.costoAcquisto = costoAcquisto;
			return this;
		}

		public Builder withCostoBiglietto(double costoBiglietto) {
			this.costoBiglietto = costoBiglietto;
			return this;
		}

		public Builder withQuantitaNoleggioAcquistoDvd(int quantitaNoleggioAcquistoDvd) {
			this.quantitaNoleggioAcquistoDvd = quantitaNoleggioAcquistoDvd;
			return this;
		}

		public Builder withDataUscita(Date dataUscita) {
			this.dataUscita = dataUscita;
			return this;
		}

		public Builder withAnnoProduzione(int annoProduzione) {
			this.annoProduzione = annoProduzione;
			return this;
		}

		public Builder withImmagine(String immagine) {
			this.immagine = immagine;
			return this;
		}

		public Builder withTrama(String trama) {
			this.trama = trama;
			return this;
		}

		public Builder withAttoriDto(List<AttoreDto> attoriDto) {
			this.attoriDto = attoriDto;
			return this;
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

		public List<AttoreDto> getAttoriDto() {
			return attoriDto;
		}

		public void setAttoriDto(List<AttoreDto> attoriDto) {
			this.attoriDto = attoriDto;
		}

		public String getTitoloFilm() {
			return titoloFilm;
		}

		public void setTitoloFilm(String titoloFilm) {
			this.titoloFilm = titoloFilm;
		}

		public FilmDtoEager build() {
			return new FilmDtoEager(this);
		}
	}

}
