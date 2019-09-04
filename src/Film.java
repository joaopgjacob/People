import java.util.List;

public class Film implements Comparable<Film>, IFilm{
	
	
	public String getQualityString() {
		// TODO Auto-generated method stub
		switch(quality) {
		case 0:
		case 1:
			return "Really Bad";
		case 2:
		case 3:
			return "Bad";
		case 4:
		case 5:
		case 6:
			return "Normal";
		case 7:
		case 8:
			return"Good";
		case 9:
		case 10:
			return"Excelent";
			
			default:
				return "Undifined";
		}
	}
	
	
	public String toString() {
		return "<"+title+" "+ year+" "+quality+" "+director+" CAST:"+ cast+" "+ filmtype+">";
	}
	
	String title;
	int year;
	int quality;
	Director director;
	List<Actor> cast;
	FilmType filmtype;
	
	public Film(String title, int year, int quality, Director director, List<Actor> cast, FilmType filmtype) {
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

	public List<Actor> getCast() {
		return cast;
	}

	public void setCast(List<Actor> cast) {
		this.cast = cast;
	}

	public FilmType getFilmtype() {
		return filmtype;
	}

	public void setFilmtype(FilmType filmtype) {
		this.filmtype = filmtype;
	}


	@Override
	public int compareTo(Film o) {
		 return Integer.compare(quality, o.quality);
	}

}
