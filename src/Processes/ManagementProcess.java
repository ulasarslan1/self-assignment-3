package Processes;

//Concrete subclass of Process
public class ManagementProcess extends Process {

 public ManagementProcess(String ID, String[] operations,double[] operationCosts, int[] resourceAmounts) {
     super(ID, operations, operationCosts, resourceAmounts); // superclass call
 }

 @Override
 public double processDuration() {
     // Example logic: each management task = 1 hour
     return operations.length * 1.0;
 }

 @Override
 public void processResources() {
     System.out.println("Resources required: Computers, Software Tools, Office Staff");
 }
}
