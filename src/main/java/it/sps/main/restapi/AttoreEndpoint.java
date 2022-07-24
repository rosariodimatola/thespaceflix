package it.sps.main.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.sps.main.dtos.AttoreDto;
import it.sps.main.dtos.FilmDtoSlim;
import it.sps.main.services.AttoreServiceImpl;
import it.sps.main.wrapper.WrapperList;

@RequestMapping("api/v1/actors")
@RestController
@CrossOrigin(origins = "*")
public class AttoreEndpoint {

	@Autowired
	AttoreServiceImpl attoreService;
	
	@Secured("ROLE_EDITOR")
	@PostMapping(path = "/saveActor")
	public ResponseEntity<Void> postItem(@RequestBody AttoreDto item) {
		attoreService.addAttore(item);
	return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@Secured("ROLE_VIEWER")
	@GetMapping(path = "/findAllActors")
	public ResponseEntity<WrapperList<AttoreDto>> getItem() {
		List<AttoreDto> listaAttoriDto = attoreService.listAllActorForWeb();
		WrapperList<AttoreDto> wrapperDtoSlim = new WrapperList<AttoreDto>(listaAttoriDto);
		return new ResponseEntity<>(wrapperDtoSlim,HttpStatus.OK);
	}
	
	@Secured("ROLE_VIEWER")
	@GetMapping(path = "/getActorById/{id}")
	public ResponseEntity<AttoreDto> getFilmById(@PathVariable Long id) {
		AttoreDto attoreDto = attoreService.searchActorForId(id);
		return new ResponseEntity<>(attoreDto,HttpStatus.OK);
	}
	
	@Secured("ROLE_EDITOR")
	@DeleteMapping(value = "/deleteActor/{id}")
	public ResponseEntity<Void> deleteActor(@PathVariable Long id) {
		attoreService.deleteActorById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}