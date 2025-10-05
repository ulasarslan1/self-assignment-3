package Resources;

public class NonHumanResources extends Resources{
	
	//Fields
	private String name; 
	
	
	//Constructor
	public NonHumanResources(String iD, String name, double costPerUnit, int amount) {
		super(iD, costPerUnit, amount);
		this.name = name;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public double calculateCost() {
		return costPerUnit * amount;
	}
	
	

}
