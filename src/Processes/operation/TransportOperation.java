package Processes;

public class TransportOperation extends IOperation {

    private double machineCostPerHour;
    private double energyCostPerHour;

    public TransportOperation(String operationID, String operationName, double duration, int resourceCount,
                              double machineCostPerHour, double energyCostPerHour) {
        super(operationID, operationName, duration, resourceCount);
        this.machineCostPerHour = machineCostPerHour;
        this.energyCostPerHour = energyCostPerHour;
    }

    @Override
    public void performOperation() {
        System.out.println("Performing transport operation: " + operationName);
    }

    @Override
    public double calculateCost() {
        return duration * resourceCount * (machineCostPerHour + energyCostPerHour);
    }
}
