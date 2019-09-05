
public interface IBillboard {

	public String toString();
	public Film getBestFilm();
	public Film removeOldFilm();
	Boolean addFilm(Film o);
	
	
}
