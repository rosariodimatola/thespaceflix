package it.sps.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.sps.main.entities.Attore;
import it.sps.main.repositories.AttoreRepository;

@Service
public class AttoreService {
	
	@Autowired
	private AttoreRepository attoreRepository;

	//Metodo che restituisce tutti gli attori
	public List<Attore> tuttiGliAttori(){
		return attoreRepository.findAll();	
	}
	
}
