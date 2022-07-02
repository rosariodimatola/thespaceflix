package it.sps.main.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import it.sps.main.dtos.AttoreDto;
import it.sps.main.entities.Attore;

@Component
public class Attore2Dto implements Converter<Attore, AttoreDto>{

	@Override
	public AttoreDto convert(Attore source) {
		AttoreDto destination = new AttoreDto();

		destination.setNome(source.getNome());
		destination.setCognome(source.getCognome());
		destination.setOscarVinti(source.getOscarVinti());
		destination.setEta(source.getDataDiNascita());
		destination.setLuogoDiNascita(source.getLuogoDiNascita());
//		BeanUtils.copyProperties(source, destination);
		return destination;
		
	}

}