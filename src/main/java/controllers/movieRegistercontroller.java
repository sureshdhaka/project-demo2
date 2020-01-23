package controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import beans.*;

@Controller
public class movieRegistercontroller {
	 @RequestMapping(method = RequestMethod.POST, value="/register/movies")
	  @ResponseBody
	  public MovieRegisterReply registerStudent(@RequestBody movies student) {
	  System.out.println("In registerStudent");
	  MovieRegisterReply stdregreply = new MovieRegisterReply();           
	        movieRegister.getInstance().add(student);
	        //We are setting the below value just to reply a message back to the caller
	        stdregreply.setMoviename(student.getMoviename());
	        stdregreply.setId(student.getId());
	        stdregreply.setMovie(student.getMovie());
	        stdregreply.setMovieStatus("Successful");
	        return stdregreply;
	}
}
