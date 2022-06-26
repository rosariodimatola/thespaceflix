package it.sps.main.dtos;

import java.util.List;

import javax.annotation.Generated;

import java.util.Collections;

public class AttoreWithFilmsDto {

	private String nome;
	private int oscarVinti;
	private String cognome;
	private int eta; // Viene calcolato con metodo apposito
	private String luogoDiNascita;
	private String nazionalita;
	private java.util.Date dataDiNascita;
	private List<FilmDtoSlim> listaFilmDto;


	@Generated("SparkTools")
	private AttoreWithFilmsDto(Builder builder) {
		this.nome = builder.nome;
		this.oscarVinti = builder.oscarVinti;
		this.cognome = builder.cognome;
		this.eta = builder.eta;
		this.luogoDiNascita = builder.luogoDiNascita;
		this.nazionalita = builder.nazionalita;
		this.dataDiNascita = builder.dataDiNascita;
		this.listaFilmDto = builder.listaFilmDto;
	}


	public AttoreWithFilmsDto() {
	}	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public java.util.Date getDataDiNascita() {
		return dataDiNascita;
	}
	
	public void setDataDiNascita(java.util.Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	public int getOscarVinti() {
		return oscarVinti;
	}
	
	public void setOscarVinti(int oscarVinti) {
		this.oscarVinti = oscarVinti;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}
	
	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}
	
	public String getNazionalita() {
		return nazionalita;
	}
	
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	
	public List<FilmDtoSlim> getListaFilmDto() {
		return listaFilmDto;
	}

	public void setListaFilmDto(List<FilmDtoSlim> listaFilmDto) {
		this.listaFilmDto = listaFilmDto;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String nome;
		private int oscarVinti;
		private String cognome;
		private int eta;
		private String luogoDiNascita;
		private String nazionalita;
		private java.util.Date dataDiNascita;
		private List<FilmDtoSlim> listaFilmDto = Collections.emptyList();

		public List<FilmDtoSlim> getListaFilmDto() {
			return listaFilmDto;
		}

		public void setListaFilmDto(List<FilmDtoSlim> listaFilmDto) {
			this.listaFilmDto = listaFilmDto;
		}

		private Builder() {
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withOscarVinti(int oscarVinti) {
			this.oscarVinti = oscarVinti;
			return this;
		}

		public Builder withCognome(String cognome) {
			this.cognome = cognome;
			return this;
		}

		public Builder withEta(int eta) {
			this.eta = eta;
			return this;
		}

		public Builder withLuogoDiNascita(String luogoDiNascita) {
			this.luogoDiNascita = luogoDiNascita;
			return this;
		}

		public Builder withNazionalita(String nazionalita) {
			this.nazionalita = nazionalita;
			return this;
		}

		public Builder withDataDiNascita(java.util.Date dataDiNascita) {
			this.dataDiNascita = dataDiNascita;
			return this;
		}

		public Builder withListaFilmDto(List<FilmDtoSlim> listaFilmDto) {
			this.listaFilmDto = listaFilmDto;
			return this;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getOscarVinti() {
			return oscarVinti;
		}

		public void setOscarVinti(int oscarVinti) {
			this.oscarVinti = oscarVinti;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public int getEta() {
			return eta;
		}

		public void setEta(int eta) {
			this.eta = eta;
		}

		public String getLuogoDiNascita() {
			return luogoDiNascita;
		}

		public void setLuogoDiNascita(String luogoDiNascita) {
			this.luogoDiNascita = luogoDiNascita;
		}

		public String getNazionalita() {
			return nazionalita;
		}

		public void setNazionalita(String nazionalita) {
			this.nazionalita = nazionalita;
		}

		public java.util.Date getDataDiNascita() {
			return dataDiNascita;
		}

		public void setDataDiNascita(java.util.Date dataDiNascita) {
			this.dataDiNascita = dataDiNascita;
		}

		public AttoreWithFilmsDto build() {
			return new AttoreWithFilmsDto(this);
		}
	}
	
	
}
