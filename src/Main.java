import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	
	
	public static void main(String[] args) {
		
		int[] years1=new int[2];
		years1[0]=1234;
		years1[1]=1998;
		
		int[] years2=new int[1];
		years2[0]=2001;
		
		int[] years3=new int[3];
		years3[0]=1998;
		years3[1]=2003;
		years3[2]=2010;
		
		Actor actor1= new Actor("jonh","smith",32, TypeActor.MAIN,years1);
		Actor actor2= new Actor("jonhy","smithy",39, TypeActor.STUNTMAN,years2);
		
		Actor actor3= new Actor("jane","Book",18, TypeActor.MAIN,years3);
		Actor actor4= new Actor("Fabio","Rogery",86, TypeActor.SUPPORT,null);
		Actor actor5= new Actor("Broklin","ninenine",55, TypeActor.SUPPORT,null);
		
		List<String>moviesbyjane=new ArrayList<String>();
		
		moviesbyjane.add("shrek");
		moviesbyjane.add("shrek 2");
		moviesbyjane.add("shrek 3");
		
		List<String>moviesbylola=new ArrayList<String>();
		
		moviesbylola.add("prestige");
		moviesbylola.add("gunshow");
		moviesbylola.add("joker");
		
		
		Director director1= new Director("jane","juuby",43,"Paramont",moviesbyjane);
		Director director2= new Director("lola","bunny",83,"Disney",moviesbyjane);
		
		
		List<Actor>shrek4actors=new ArrayList<Actor>();
		shrek4actors.add(actor1);
		shrek4actors.add(actor2);
		
		List<Actor>actors=new ArrayList<Actor>();
		actors.add(actor3);
		actors.add(actor4);
		actors.add(actor5);
		
		Film shrek4=new Film("Shrek 4", 2020, 10, director2, shrek4actors, FilmType.DRAMA);
		Film film1=new Film("Film1", 2024, 3, director1, shrek4actors, FilmType.COMMEDY);
		Film film2=new Film("Film2", 2012, 2, director1, actors, FilmType.THRILLER);
		Film film3=new Film("Film3", 2211, 6, director2, shrek4actors, FilmType.THRILLER);
		Film film4=new Film("Film4", 1890, 3, director1, actors, FilmType.CARTOON);
		
		
		
		List<Film> filmsforuser=new ArrayList<Film>();
		filmsforuser.add(shrek4);
		
		User user1=new User("userguy1","lastnameguy1",53,6,filmsforuser,"username421");
		User user2=new User("userguy2","lastnameguy2",22,7,filmsforuser,"username422");
		User user3=new User("userguy3","lastnameguy3",12,8,filmsforuser,"username423");
		
		
		List<Film> l = new ArrayList<Film>();
		l.add(film1);
		l.add(film2);
		l.add(film3);
		l.add(film4);
		l.add(shrek4);
		
		List<People> peop= new ArrayList<People>();
		
		peop.add(director1);
		peop.add(director2);
		peop.add(actor1);
		peop.add(actor2);
		peop.add(actor3);
		peop.add(actor4);
		peop.add(actor5);
		peop.add(user1);
		peop.add(user2);
		peop.add(user3);
		
		
		Collections.sort(l);
		
		Collections.sort(peop);
		
		for(int i=0;i<l.size();i++)
			{
				System.out.println(l.get(i).toString());
				
				
			}
		
		
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
