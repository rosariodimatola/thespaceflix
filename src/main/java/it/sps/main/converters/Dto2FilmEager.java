package it.sps.main.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import it.sps.main.dtos.AttoreDto;
import it.sps.main.dtos.FilmDtoEager;
import it.sps.main.entities.Attore;
import it.sps.main.entities.Film;
import it.sps.main.repositories.AttoreRepository;

@Component
public class Dto2FilmEager implements Converter<FilmDtoEager, Film>{
	
	@Autowired
	private Converter<AttoreDto, Attore> dto2Attore;
	
	@Autowired
	private AttoreRepository attoreRepository;
	
	@Override
	public Film convert(FilmDtoEager source) {
		Film destination = new Film();
		
		List<Attore> listaAttori = new ArrayList<Attore>();
		BeanUtils.copyProperties(source, destination);
		for (AttoreDto attoreDto : source.getAttoriDto()) {
			/*if ( attoreDto.getId() < 0 ) {
				Attore attore = attoreRepository.findById(attoreDto.getId()).get();
			}*/
			listaAttori.add(dto2Attore.convert(attoreDto));
		}
		destination.setAttori(listaAttori);
		return destination;
		
	}

}