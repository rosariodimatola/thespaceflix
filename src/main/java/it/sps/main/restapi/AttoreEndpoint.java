package it.sps.main.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.sps.main.dtos.AttoreDto;
import it.sps.main.services.AttoreService;

@RequestMapping("api/v1/attori")
@RestController
public class AttoreEndpoint {

	@Autowired
	AttoreService attoreService;
	
	@PostMapping(path = "/save")
	public ResponseEntity<Void> postItem(@RequestBody AttoreDto item) {
		attoreService.addAttore(item);
		HttpHeaders hh=new HttpHeaders();
		hh.add("Location", "www.ciao.com"+item.getCognome());
	return new ResponseEntity<>(hh,HttpStatus.CREATED);
	}
	
}