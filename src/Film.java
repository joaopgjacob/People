import java.util.List;

public class Film implements IFilm{

	@Override
	public void getQualityString() {
		// TODO Auto-generated method stub
		
	}
	String title;
	int year;
	int quality;
	Director director;
	List[] cast;
	String filmtype;
	
	public Film(String title, int year, int quality, Director director, List[] cast, String filmtype) {
		super();
		this.title = title;
		this.year = year;
		this.quality = quality;
		this.director = director;
		this.cast = cast;
		this.filmtype = filmtype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List[] getCast() {
		return cast;
	}

	public void setCast(List[] cast) {
		this.cast = cast;
	}

	public String getFilmtype() {
		return filmtype;
	}

	public void setFilmtype(String filmtype) {
		this.filmtype = filmtype;
	}
	
	
	
}
