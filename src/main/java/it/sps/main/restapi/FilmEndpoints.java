package it.sps.main.restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
public class FilmEndpoints {

	@Autowired
	private FilmService filmService;
	
	@GetMapping(path = "/findAllFilm")
	public ResponseEntity<WrapperList<FilmDtoSlim>> getItem() {
		List<FilmDtoSlim> listaFilmDtoSlim = filmService.listAllFilmForWeb();
		WrapperList<FilmDtoSlim> wrapperDtoSlim = new WrapperList<FilmDtoSlim>(listaFilmDtoSlim);
		return new ResponseEntity<>(wrapperDtoSlim,HttpStatus.OK);
	}
	
	@PostMapping(value = "/saveFilm")
	public ResponseEntity<Void> postItem(@RequestBody FilmDtoSlim filmDtoSlim) {
		filmService.addFilm(filmDtoSlim);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	/*
	@PostMapping(path = "/save")
    public ResponseEntity<Void> postItem(@RequestBody ItemDto item){
     iservice.saveItem(item);
     HttpHeaders hh=new HttpHeaders();
     hh.add("Location", "www.ciao.com"+item.getWebid());
        return new ResponseEntity<>(hh,HttpStatus.CREATED);
    }
	*/
}