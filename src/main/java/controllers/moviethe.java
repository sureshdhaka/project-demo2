package controllers;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import beans.*;

@Controller
public class moviethe {
	 @RequestMapping(method = RequestMethod.GET, value="/movies/search/the/3")
	  
	  @ResponseBody
	  public List<movies> getAllMovies() {
	  return movieRegister.getInstance().getmoviesRecords();
	  }
}
