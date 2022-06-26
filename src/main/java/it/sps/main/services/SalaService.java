package it.sps.main.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.sps.main.entities.Sala;
import it.sps.main.repositories.SalaRepository;

@Service
public class SalaService {
	
	@Autowired
	private SalaRepository salaRepository;

	//Metodo che restituisce la lista di tutte le sale
	@Transactional
	public List<Sala> tutteLeSale(){
		return salaRepository.findAll();	
	}
	
	public void addSala(String nome, String indirizzo, int numeroPosti, String tipo) {
		
		Sala sala = new Sala();
		
		sala.setNomeSala(nome);
		sala.setIndirizzoSala(indirizzo);
		sala.setNumeroPostiSala(numeroPosti);
		sala.setTipoSala(tipo);
		salaRepository.save(sala);
	}
	
}
