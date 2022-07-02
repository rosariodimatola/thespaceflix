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
		
		BeanUtils.copyProperties(source, destination);
		destination.setDataDiNascita(SqlDate.toJavaSqlDate(source.getDataDiNascita()));
		return destination;
		
	}

}