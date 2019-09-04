import java.util.ArrayList;
import java.util.List;

public class Main {

	
	
	public static void main(String[] args) {
		
		int[] years=new int[2];
		years[0]=1234;
		years[1]=1998;
		Actor actor1= new Actor("jonh","smith",32, TypeActor.MAIN,years);
		
		Actor actor2= new Actor("jonhy","smithy",39, TypeActor.STUNTMAN,years);
		
		List<String>moviesbyjane=new ArrayList<String>();
		
		moviesbyjane.add("shrek");
		moviesbyjane.add("shrek 2");
		moviesbyjane.add("shrek 3");
		
		Director director1= new Director("jane","juuby",43,"Paramont",moviesbyjane);
		
		List<Actor>shrek4actors=new ArrayList<Actor>();
		
		shrek4actors.add(actor1);
		shrek4actors.add(actor2);
		
		
		Film shrek4=new Film("Shrek 4", 2020, 10, director1, shrek4actors, FilmType.DRAMA);
		Film film1=new Film("Film1", 2024, 3, director1, shrek4actors, FilmType.COMMEDY);
		Film film2=new Film("Film2", 2012, 2, director1, shrek4actors, FilmType.THRILLER);
		Film film3=new Film("Film3", 2211, 6, director1, shrek4actors, FilmType.THRILLER);
		Film film4=new Film("Film4", 1890, 3, director1, shrek4actors, FilmType.CARTOON);
		
		List<Film> l = new ArrayList<Film>();
		l.add(film1);
		l.add(film2);
		l.add(film3);
		l.add(film4);
		l.add(shrek4);
		for(int i=0;i<l.size();i++)
			{
				System.out.println(l.get(i).toString());
				
				
			}
		System.out.println();
		
		/*
		System.out.println(film3.title);
		System.out.println(film3.year);
		System.out.println(film3.quality);
		System.out.println(film3.director);
		System.out.println(film3.cast);
		System.out.println(film3.filmtype);
		*/
	}
}
