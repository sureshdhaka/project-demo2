package beans;

import java.util.ArrayList;
import java.util.List;
public class movieRegister {
	 private List<movies> moviesRecords;
	    private static movieRegister stdregd = null;
	    private movieRegister(){
	    moviesRecords = new ArrayList<movies>();
	    }
	    public static movieRegister getInstance() {
	        if(stdregd == null) {
	              stdregd = new movieRegister();
	              return stdregd;
	            }
	            else {
	                return stdregd;
	            }
	    }
	    public void add(movies std) {
	    moviesRecords.add(std);
	    }
	public String upDatemovies(movies std) {
	for(int i=0; i<moviesRecords.size(); i++)
	        {
	            movies stdn = moviesRecords.get(i);
	            if(stdn.getMovie().equals(std.getMovie())) {
	              moviesRecords.set(i, std);//update the new record
	              return "Update successful";
	            }
	        }
	return "Update un-successful";
	}
	public String deletemovies(String registrationNumber) {
	for(int i=0; i<moviesRecords.size(); i++)
	        {
	            movies stdn = moviesRecords.get(i);
	            if(stdn.getMovie().equals(registrationNumber)){
	              moviesRecords.remove(i);//update the new record
	              return "Delete successful";
	            }
	        }
	return "Delete un-successful";
	}
	    public List<movies> getmoviesRecords() {
	    return moviesRecords;
	    }
}
