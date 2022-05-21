package it.sps.main.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.sps.main.entities.Sala;
import it.sps.main.repositories.SalaRepository;

@Service
public class SalaService {
	
	@Autowired
	private SalaRepository salaRepository;

	//Metodo che restituisce la lista di tutte le sale
	public List<Sala> tutteLeSale(){
		return salaRepository.findAll();	
	}
	
}
