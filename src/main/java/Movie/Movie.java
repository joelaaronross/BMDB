package Movie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String title;
	
	
	public Movie(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}


	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + "]";
	}
	
	
	
}
