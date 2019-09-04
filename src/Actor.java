import java.util.ArrayList;
import java.util.List;

public class Actor extends People{

	/*enum tipoActor{
		Main,Supporting,Stuntman;
	}*/
	int tipoActor;
	List oscarNominations;
	
	
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String name, String surname, int age,int tipoActor) {
		super(name, surname, age);
		this.tipoActor=tipoActor;
		// TODO Auto-generated constructor stub
	}

	public String getTipoActor() {
		
		if(tipoActor==1) {
			return "Main";
		}
		else if(tipoActor==2) {
			return "Support";
		}
		else if(tipoActor==3) {
			return "Stuntman";
		}
		else {return "Undefined";}
	}

	public void setTipoActor(int tipoActor) {
		this.tipoActor = tipoActor;
	}

	
	
	
	
	
}
