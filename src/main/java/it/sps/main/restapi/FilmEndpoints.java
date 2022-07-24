package it.sps.main.restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

// Le entities non devono essere importate nella parte rest controller, ma solo nella parte services
import it.sps.main.dtos.FilmDtoSlim;
import it.sps.main.services.FilmService;
import it.sps.main.wrapper.WrapperList;

@RequestMapping("api/v1/film")
@RestController
@CrossOrigin(origins = "*")
public class FilmEndpoints {

	@Autowired
	private FilmService filmService;
	
	@Secured("ROLE_VIEWER")
	@GetMapping(path = "/findAllFilm")
	public ResponseEntity<WrapperList<FilmDtoSlim>> findAllFilm() {
		List<FilmDtoSlim> listaFilmDtoSlim = filmService.listAllFilmForWeb();
		WrapperList<FilmDtoSlim> wrapperDtoSlim = new WrapperList<FilmDtoSlim>(listaFilmDtoSlim);
		return new ResponseEntity<>(wrapperDtoSlim,HttpStatus.OK);
	}
	
	@Secured("ROLE_VIEWER")
	@GetMapping(path = "/getFilmById/{id}")
	public ResponseEntity<FilmDtoSlim> getFilmById(@PathVariable Long id) {
		FilmDtoSlim filmDtoSlim = filmService.searchFilmForId(id);
		return new ResponseEntity<>(filmDtoSlim,HttpStatus.OK);
	}
	
	@Secured("ROLE_EDITOR")
	@PostMapping(value = "/saveFilm")
	public ResponseEntity<Void> postItem(@RequestBody FilmDtoSlim filmDtoSlim) {
		filmService.addFilm(filmDtoSlim);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	/*
	//Chiamo lo stesso medoto della save ma in PUT in modo da rispettare lo standard REST che prevede che le update vadano fatte in PUT
	@PutMapping(value = "/saveFilm")
	@Secured("ROLE_EDITOR")
	public ResponseEntity<Void> putItem(@RequestBody FilmDtoSlim filmDtoSlim) {
		return postItem(filmDtoSlim);
	}
	*/
	
	@Secured("ROLE_EDITOR")
	@DeleteMapping(value = "/deleteFilm/{id}")
	public ResponseEntity<Void> deleteFilm(@PathVariable Long id) {
		filmService.deleteFilmById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}