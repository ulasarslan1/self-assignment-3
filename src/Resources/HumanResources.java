package Resources;

public class HumanResources extends Resources{

	//Fields
	private String role;
	private double salaryPerHour;
	private double workHour;
	
	//Constructor
	public HumanResources(String iD, String role, double salaryPerHour, double workHour) {
		super(iD, salaryPerHour, 1);
		this.role = role;
		this.salaryPerHour = salaryPerHour;
		this.workHour = workHour;
	}
	
	//Getters and setters
	public double getSalaryPerHour() {return salaryPerHour;}
	public void setSalaryPerHour(double salaryPerHour) {this.salaryPerHour = salaryPerHour;}
	
	public double getWorkHour() {return workHour;}
	public void setWorkHour(double workHour) {	this.workHour = workHour;}
	
	//Cost calculation
	@Override
	public double calculateCost() {
		return salaryPerHour * workHour;
	}
	
	
	

}
