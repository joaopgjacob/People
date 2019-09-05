import java.util.LinkedList;
import java.util.List;

public class Billboard implements IBillboard{

	public Billboard() {
		super();
	}

	LinkedList<Film> filmBillBoard;

	public List<Film> getFilmBillBoard() {
		
		return filmBillBoard;
	}

	@Override
	public String toString() {
		return filmBillBoard.toString();
	}
	
	
	@Override
	public Film getBestFilm() {
		int x=0;
		for(int i=0;i<filmBillBoard.size();i++) {
			if(filmBillBoard.get(i).getQuality()>x) {
				
				x=filmBillBoard.get(i).getQuality();
				
				return filmBillBoard.get(i);
			}
			
			
		}
		return null;
		
	}

	@Override
	public Boolean addFilm(Film o) {
		
		if(filmBillBoard.size()<5 ) {
			
			filmBillBoard.add(o);
			
			return true;
		}
		else if(filmBillBoard.size()>=5 ) {
			

			
			return false;
		}
		else {return false;}
	}

	@Override
	public Film removeOldFilm() {
		// TODO Auto-generated method stub
		
		Film x=filmBillBoard.get(0);
		filmBillBoard.remove(0);
		return x;
	}
	
	
	
	
}
