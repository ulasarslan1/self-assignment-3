package Resources;

public abstract class Resources {
	
	//Fields
	protected String ID;
	protected double costPerUnit;
    protected int amount;
    
    //Constructor
    public Resources(String iD, double costPerUnit, int amount) {
		ID = iD;
		this.costPerUnit = costPerUnit;
		this.amount = amount;
	}
    
    //Getters and setters
    public String getID() {return ID;}
	public void setID(String iD) {ID = iD;}
	
	public double getCostPerUnit() {return costPerUnit;}
	public void setCostPerUnit(double costPerUnit) {this.costPerUnit = costPerUnit;}
	
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
	
	//Get data
	public String getData(){
		return "Resources [ID=" + ID + ", costPerUnit=" + costPerUnit + ", amount=" + amount + "]";
	}	
    
	//Abstract method for calculation
	public abstract double calculateCost();
}
