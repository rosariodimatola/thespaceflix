package it.sps.main.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import it.sps.main.dtos.AttoreDto;
import it.sps.main.entities.Attore;
import lombok.extern.slf4j.Slf4j;

public interface AttoreService {
	
	List<Attore> listaTuttiGliAttori();
	
	List<AttoreDto> listAllActorForWeb();
	
	void addAttore(AttoreDto attoreDto);
	
	void updateAttore(AttoreDto attoreDto);
	
	AttoreDto searchActorForId(Long id);
	
	void deleteActorById(Long id);
	
}
	
