package it.sps.main.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "ruoli")
public class Ruolo extends EntitaGenerica {
	
	@Column(name = "nome_ruolo", nullable = false)
	private String nomeRuolo;
	
	@Column(name = "descrizione", nullable = false)
	private String descrizione;
	
	public Ruolo() {}

	public String getNomeRuolo() {
		return nomeRuolo;
	}

	public void setNomeRuolo(String nomeRuolo) {
		this.nomeRuolo = nomeRuolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
