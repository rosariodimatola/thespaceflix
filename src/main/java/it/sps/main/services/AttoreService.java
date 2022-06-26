package it.sps.main.services;

import java.util.List;

import javax.persistence.Convert;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import it.sps.main.dtos.AttoreDto;
import it.sps.main.entities.Attore;
import it.sps.main.repositories.AttoreRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
//Per alcune annotazioni che vengono usate per i metodi se impostate a livello di classe vengono ereditate da tutti i metodi
@Transactional
public class AttoreService {
	
	@Autowired
	private AttoreRepository attoreRepository;
	
	@Autowired
	private Converter<AttoreDto, Attore> dto2Attore;

	//Metodo che restituisce tutti gli attori
	public List<Attore> listaTuttiGliAttori(){
		return attoreRepository.findAll();	
	}
	
	/*
	public void addAttore(String nome, String cognome, String dataDiNascita, String luogoDiNascita, String nazionalita, int oscarVinti) {
		
		Attore attore = new Attore();
		
		attore.setNome(nome);
		attore.setCognome(cognome);
//		attore.setDataDiNascita(dataDiNascitaAttore);
		attore.setLuogoDiNascita(luogoDiNascita);
		attore.setNazionalita(nazionalita);
		attore.setOscarVinti(oscarVinti);
		attoreRepository.save(attore);
	}*/
	
	// Prendo in input un attoreDto e tramite il converter (che restituisce un oggetto di tipo attore)
	// faccio la save
	public void addAttore(AttoreDto attoreDto) {
//		log.info("Persisto l'attore {}", attoreDto);
		Attore attore = dto2Attore.convert(attoreDto);
		attoreRepository.save(attore);
	}
	
	public void updateAttore(AttoreDto attoreDto) {
		this.addAttore(attoreDto);
	}
	
	
	
}
