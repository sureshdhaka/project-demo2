package controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import beans.movies;
import beans.movieRegister;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class movieretrive {

	  @RequestMapping(method = RequestMethod.GET, value="/movies/search/j/2")
	  
	  @ResponseBody
	  public List<movies> getAllMovies() {
	  return movieRegister.getInstance().getmoviesRecords();
	  }

}
