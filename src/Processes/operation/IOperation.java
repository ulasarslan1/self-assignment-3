package self_assignment_2;

import java.util.Arrays;

// ====================================
// Abstract Class: IOperation
// ====================================
public abstract class IOperation {
	
	private String operationID;
	private String description;
	private long nominalTime;
	private Object[] resources;  // can hold either AGV or HumanResources
	private int resourceCount = 0;
	
	// Constructor
	public IOperation(String operationID, String description, long nominalTime, int maxResources) {
		this.operationID = operationID;
		this.description = description;
		this.nominalTime = nominalTime;
		this.resources = new Object[maxResources];
	}
	
	// Getter for nominal time
	public long getNominalTime() {
		return nominalTime;
	}
	
	// Add a resource (AGV or HumanResources)
	public void addResources(Object resource) {
		if (resourceCount < resources.length) {
			resources[resourceCount] = resource;
			resourceCount++;
		} else {
			System.out.println("No more resources can be added.");
		}
	}
	
	// Get resources
	public Object[] getResources() {
		return resources;
	}
	
	// Set new data
	public void setData(String id, String description, long nominalTime) {
	     this.operationID = id;
	     this.description = description;
	     this.nominalTime = nominalTime;
	}
	
	// Get all operation data
	public String getData() {
		return "IOperation [operationID = " + operationID + 
				", description = " + description + 
				", nominalTime = " + nominalTime + " min" + 
				", resources = " + Arrays.toString(resources) + "]";
	}
	
	@Override
	public String toString() {
		return operationID;
	}
	
	// Abstract method — must be defined by subclasses
	public abstract void executeOperation();
}
