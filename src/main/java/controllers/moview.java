package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import beans.movieRegister;
import beans.movies;

public class moview {
	 @RequestMapping(method = RequestMethod.GET, value="/movies/search/w/3")
	  
	  @ResponseBody
	  public List<movies> getAllMovies() {
	  return movieRegister.getInstance().getmoviesRecords();
	  }
}
