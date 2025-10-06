package Resources;

public class MaterialResources extends NonHumanResources{
	
	//Fields
	private String name; 
	
	
	//Constructor
	public MaterialResources(String iD, String name, double costPerUnit, int amount) {
		super(iD, name , 0 ,0);
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
