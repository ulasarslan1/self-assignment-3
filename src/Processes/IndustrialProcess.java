package Processes;

public class IndustrialProcess extends Process {

    public IndustrialProcess(String ID, String[] operations,double[] operationCosts, int[] resourceAmounts) {
        super(ID, operations, operationCosts, resourceAmounts); // superclass call
    }

    @Override
    public double processDuration() {
        return operations.length * 2.5;
    }

    @Override
    public void processResources() {
        System.out.println("Uses machines and human labor.");
    }
}
