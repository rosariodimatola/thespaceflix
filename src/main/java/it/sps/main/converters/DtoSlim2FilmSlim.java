package it.sps.main.converters;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import it.sps.main.dtos.FilmDtoSlim;
import it.sps.main.entities.Film;

@Component
public class DtoSlim2FilmSlim implements Converter<FilmDtoSlim, Film>{

	@Override
	public Film convert(FilmDtoSlim source) {
		Film destination = new Film();

		BeanUtils.copyProperties(source, destination);
		return destination;
		
	}

}