package it.sps.main.converters;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import it.sps.main.dtos.AttoreDto;
import it.sps.main.entities.Attore;
import utilities.sql.SqlDate;

@Component
public class Dto2Attore implements Converter<AttoreDto, Attore>{

	@Override
	public Attore convert(AttoreDto source) {
		Attore destination = new Attore();
		

/*		destination.setNome(source.getNome());
		destination.setCognome(source.getCognome());
		destination.setOscarVinti(source.getOscarVinti());
		destination.setLuogoDiNascita(source.getLuogoDiNascita());
		destination.setNazionalita(source.getNazionalita());
		destination.setDataDiNascita(SqlDate.toJavaSqlDate(source.getDataDiNascita()));*/
		BeanUtils.copyProperties(source, destination);
		destination.setDataDiNascita(SqlDate.toJavaSqlDate(source.getDataDiNascita()));
		return destination;
		
	}

}