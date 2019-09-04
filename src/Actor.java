import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Actor extends People{

	
	int tipoActor;
	int[] oscarNominations;
	
	
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String name, String surname, int age,int tipoActor, int[] oscarNominations) {
		super(name, surname, age);
		this.tipoActor=tipoActor;
		this.oscarNominations=oscarNominations;
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

	public int[] getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(int[] oscarNominations) {
		this.oscarNominations = oscarNominations;
	}
	
}
