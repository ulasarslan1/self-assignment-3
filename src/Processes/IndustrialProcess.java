package Processes;

public class IndustrialProcess extends Process {

    public IndustrialProcess(String ID, String[] operations) {
        super(ID, operations); // ✅ correct superclass call
    }

    @Override
    public double processDuration() {
        return operations.length * 1.5;
    }

    @Override
    public void processResources() {
        System.out.println("Resources required: Machines, Energy, Human Operators");
    }
}