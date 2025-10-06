package self_assignment_2;

import java.util.Arrays;

package Processes;

public abstract class IOperation {
    protected String operationID;
    protected String operationName;
    protected double duration;  // in hours
    protected int resourceCount;

    public IOperation(String operationID, String operationName, double duration, int resourceCount) {
        this.operationID = operationID;
        this.operationName = operationName;
        this.duration = duration;
        this.resourceCount = resourceCount;
    }

    // Abstract methods
    public abstract void performOperation();
    public abstract double calculateCost();

    // Common method
    public void showOperationInfo() {
        System.out.println("Operation ID: " + operationID);
        System.out.println("Operation Name: " + operationName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Resources Used: " + resourceCount);
    }
}

