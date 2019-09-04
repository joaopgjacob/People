import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Actor extends People{

	public String toString() {
		return "<ACTOR: "+this.getName()+" "+this.getSurname()+" "+this.getAge()+" "+tipoActor+" "+ Arrays.toString(oscarNominations)+">";
	}
	TypeActor tipoActor;
	int[] oscarNominations;
	
	
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String name, String surname, int age,TypeActor tipoActor, int[] oscarNominations) {
		super(name, surname, age);
		this.tipoActor=tipoActor;
		this.oscarNominations=oscarNominations;
		// TODO Auto-generated constructor stub
	}

	public TypeActor getTipoActor() {
		
		return tipoActor;
	}
	

	public void setTipoActor(TypeActor tipoActor) {
		this.tipoActor = tipoActor;
	}

	public int[] getOscarNominations() {
		
		return oscarNominations;
	}

	public void setOscarNominations(int[] oscarNominations) {
		this.oscarNominations = oscarNominations;
	}
	
}
