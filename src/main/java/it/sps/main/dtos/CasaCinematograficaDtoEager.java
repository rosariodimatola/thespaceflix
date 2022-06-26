package it.sps.main.dtos;

import java.util.List;

public class CasaCinematograficaDtoEager extends CasaCinematograficaDtoSlim {

	private String partitaIva;
	
	private List<AttoreDto> attoriDto;
	
	private List<FilmDtoSlim> filmDto;
	
	public CasaCinematograficaDtoEager() {
		super();
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public List<AttoreDto> getAttoriDto() {
		return attoriDto;
	}

	public void setAttoriDto(List<AttoreDto> attoriDto) {
		this.attoriDto = attoriDto;
	}

	public List<FilmDtoSlim> getFilmDto() {
		return filmDto;
	}

	public void setFilmDto(List<FilmDtoSlim> filmDto) {
		this.filmDto = filmDto;
	}

	@Override
	public String toString() {
		return "CasaCinematograficaDtoEager [\n"
				+ "nome=" + super.getNome() + "\n"
				+ "nazionalità=" + super.getNazionalita() + "\n"
				+ "partitaIva=" + partitaIva + "\n" 
				+ ", attoriDto=" + attoriDto + "\n"
				+ ", filmDto="+ filmDto + "\n]";
	}
	
}
