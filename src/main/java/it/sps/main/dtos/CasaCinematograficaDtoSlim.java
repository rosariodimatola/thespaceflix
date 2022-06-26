package it.sps.main.dtos;

import javax.annotation.Generated;

import org.springframework.beans.BeanUtils;

public class CasaCinematograficaDtoSlim {

	private String nome;
	
	private String nazionalita;

	@Generated("SparkTools")
	private CasaCinematograficaDtoSlim(Builder builder) {
		BeanUtils.copyProperties(builder, this);
	}

	public CasaCinematograficaDtoSlim() {	
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	@Override
	public String toString() {
		return "CasaCinematograficaDtoSlim [nome=" + nome + ", nazionalita=" + nazionalita + "]";
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String nome;
		private String nazionalita;

		private Builder() {
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withNazionalita(String nazionalita) {
			this.nazionalita = nazionalita;
			return this;
		}

		public CasaCinematograficaDtoSlim build() {
			return new CasaCinematograficaDtoSlim(this);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getNazionalita() {
			return nazionalita;
		}

		public void setNazionalita(String nazionalita) {
			this.nazionalita = nazionalita;
		}
	
	}
	
}
