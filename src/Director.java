import java.util.List;

public class Director extends People{
	
	
	String ProductionCompany;
	List Filmografia;

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(String name, String surname, int age,String ProductionCompany) {
		super(name, surname, age);
		this.ProductionCompany=ProductionCompany;
		// TODO Auto-generated constructor stub
	}

	
	
	
}
