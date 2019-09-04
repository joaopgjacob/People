import java.util.List;

public class Director extends People{
	

	String productionCompany;
	List<String> filmografia;

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		
		return  "<DIRECTOR: "+this.getName()+" "+this.getSurname()+" "+this.getAge() +" "+productionCompany+" "+filmografia +">";
	}
	
	public Director(String name, String surname, int age,String productionCompany,List<String> filmografia) {
		super(name, surname, age);
		this.productionCompany=productionCompany;
		this.filmografia=filmografia;
		// TODO Auto-generated constructor stub
	}

	public String getProductionCompany() {
		return productionCompany;
	}

	public List<String> getFilmografia() {
		return filmografia;
	}

	public void setFilmografia(List<String> filmografia) {
		this.filmografia = filmografia;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}


	
	
}
