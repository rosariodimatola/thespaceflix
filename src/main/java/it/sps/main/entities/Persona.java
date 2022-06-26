package it.sps.main.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona extends EntitaGenerica{
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "cognome", nullable = false)
	private String cognome;
	
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	
	@Column(name = "codice_documento")
	private String codiceDocumento;
	
	@Column(name = "data_di_nascita", nullable = false)
	private java.sql.Date dataDiNascita;
	
	@Column(name = "luogo_di_nascita", nullable = false)
	private String luogoDiNascita;

	@Column(name = "nazionalita", nullable = false)
	private String nazionalita;
	
	public Persona() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getCodiceDocumento() {
		return codiceDocumento;
	}

	public void setCodiceDocumento(String codiceDocumento) {
		this.codiceDocumento = codiceDocumento;
	}

	public java.sql.Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(java.sql.Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
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

}
