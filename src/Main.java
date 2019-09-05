import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	
	
	public static void main(String[] args) {
		
		//years that actors won oscars
		int[] years1=new int[2];
		years1[0]=1234;
		years1[1]=1998;
		
		int[] years2=new int[1];
		years2[0]=2001;
		
		int[] years3=new int[3];
		years3[0]=1998;
		years3[1]=2003;
		years3[2]=2010;
		
		//creating actors
		Actor actor1= new Actor("jonh","smith",32, TypeActor.MAIN,years1);
		Actor actor2= new Actor("jonhy","smithy",39, TypeActor.STUNTMAN,years2);
		
		Actor actor3= new Actor("jane","Book",18, TypeActor.MAIN,years3);
		Actor actor4= new Actor("Fabio","Rogery",86, TypeActor.SUPPORT,null);
		Actor actor5= new Actor("Broklin","ninenine",55, TypeActor.SUPPORT,null);
		
		//lists to give directos for Filmografia
		List<String>moviesbyjane=new ArrayList<String>();
		
		moviesbyjane.add("shrek");
		moviesbyjane.add("shrek 2");
		moviesbyjane.add("shrek 3");
		
		List<String>moviesbylola=new ArrayList<String>();
		
		moviesbylola.add("prestige");
		moviesbylola.add("gunshow");
		moviesbylola.add("joker");
		
		//creating directors
		Director director1= new Director("jane","juuby",43,"Paramont",moviesbyjane);
		Director director2= new Director("lola","bunny",83,"Disney",moviesbyjane);
		
		//creating casts for the films
		List<Actor>shrek4actors=new ArrayList<Actor>();
		shrek4actors.add(actor1);
		shrek4actors.add(actor2);
		
		List<Actor>actors=new ArrayList<Actor>();
		actors.add(actor3);
		actors.add(actor4);
		actors.add(actor5);
		
		//creating films
		Film shrek4=new Film("Shrek 4", 2020, 10, director2, shrek4actors, FilmType.DRAMA);
		Film film1=new Film("Film1", 2024, 3, director1, shrek4actors, FilmType.COMMEDY);
		Film film2=new Film("Film2", 2012, 2, director1, actors, FilmType.THRILLER);
		Film film3=new Film("Film3", 2211, 6, director2, shrek4actors, FilmType.THRILLER);
		Film film4=new Film("Film4", 1890, 3, director1, actors, FilmType.CARTOON);
		
		
		//creating a list for the users for the watched films
		List<Film> filmsforuser=new ArrayList<Film>();
		filmsforuser.add(shrek4);
		
		
		//creating map for user ratings
		Map<String, Integer> user1rating = new HashMap<>();
		Map<String, Integer> user2rating = new HashMap<>();
		Map<String, Integer> user3rating = new HashMap<>();
		
		user1rating.put("Amazonia", 7);
		user1rating.put("Amazonia 2", 3);
		user2rating.put("Amazonia The return", 5);
		user2rating.put("Amazonia The revenge", 8);
		user3rating.put("Amazonia The return of Juarez", 10);
		
		//creating user
		User user1=new User("userguy1","lastnameguy1",53,user1rating,filmsforuser,"username421");
		User user2=new User("userguy2","lastnameguy2",22,user2rating,filmsforuser,"username422");
		User user3=new User("userguy3","lastnameguy3",12,user3rating,filmsforuser,"username423");
		
		// julio example of something
		//User u = new User();
		
		//list of films
		List<Film> l = new ArrayList<Film>();
		l.add(film1);
		l.add(film2);
		l.add(film3);
		l.add(film4);
		l.add(shrek4);
		
		//list of people
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
		
		//sorting the film and peop list
		Collections.sort(l);
		
		Collections.sort(peop);
		
		
		//print films
		for(int i=0;i<l.size();i++)
			{
				System.out.println(l.get(i).toString());
			}
		
		//creating an actor list to sort the oscar stuff
		
		List<Actor> allActors= new ArrayList<Actor>();
		allActors.add(actor1);
		allActors.add(actor2);
		allActors.add(actor3);
		allActors.add(actor4);
		allActors.add(actor5);
		
		List<Actor> actuallyGoodActors= new ArrayList<Actor>();
		
		for(int i=0;i<allActors.size();i++) {
			
			if(allActors.get(i).getOscarNominations()!=null) {
				
				actuallyGoodActors.add(allActors.get(i));
				
			}
		}	
		
	}
}
