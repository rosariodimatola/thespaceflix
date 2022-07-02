package it.sps.main.converters;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import it.sps.main.dtos.FilmDtoSlim;
import it.sps.main.entities.Film;

@Component
public class Film2DtoSlim implements Converter<Film, FilmDtoSlim>{

	@Override
	public FilmDtoSlim convert(Film source) {
		FilmDtoSlim destination = new FilmDtoSlim();

		/*
		destination.setNome(source.getNome());
		destination.setCognome(source.getCognome());
		destination.setOscarVinti(source.getOscarVinti());
		destination.setEta(source.getDataDiNascita());
		destination.setLuogoDiNascita(source.getLuogoDiNascita());*/
		BeanUtils.copyProperties(source, destination);
		return destination;
		
	}

}