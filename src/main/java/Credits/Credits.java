package Credits;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Credits {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private int actorID;
	private int movieID;
	private String characterName;
	
	
	public Credits(int id, int actorID, int movieID, String characterName) {
		super();
		this.id = id;
		this.actorID = actorID;
		this.movieID = movieID;
		this.characterName = characterName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getActorID() {
		return actorID;
	}


	public void setActorID(int actorID) {
		this.actorID = actorID;
	}


	public int getMovieID() {
		return movieID;
	}


	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}


	public String getCharacterName() {
		return characterName;
	}


	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}


	@Override
	public String toString() {
		return "Credits [id=" + id + ", actorID=" + actorID + ", movieID=" + movieID + ", characterName="
				+ characterName + "]";
	}
	
}
