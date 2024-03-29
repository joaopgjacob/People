import java.util.List;
import java.util.Map;



public class User extends People implements IUser{

	Map<String,Integer> rating;
	List<Film> watchedFilms;
	String username;
	
	
	@Override
	public Double getAverageRating() throws NoRatedFilmsException{
		double averageRating = 0;
		if (rating != null && !rating.isEmpty()) {
			int entradas = rating.size();
			double soma = 0;
			for (Integer value : rating.values()) {
				soma = soma + value;
			}

			averageRating = soma / entradas;

		} else {
			 throw new NoRatedFilmsException();
		}
		return averageRating;
	}
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String surname, int age, Map<String, Integer> rating, List<Film> watchedFilms, String username) {
		super(name, surname, age);
		this.rating = rating;
		this.watchedFilms = watchedFilms;
		this.username = username;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


	public Map<String, Integer> getRating() {
		return rating;
	}


	public void setRating(Map<String, Integer> rating) {
		this.rating = rating;
	}


	public List<Film> getWatchedFilms() {
		return watchedFilms;
	}


	public void setWatchedFilms(List<Film> watchedFilms) {
		this.watchedFilms = watchedFilms;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}



	
	
	
}
