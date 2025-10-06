package Processes;

public abstract class Process {
    protected String ID;
    protected String[] operations;

    public Process(String ID, String[] operations) {
        this.ID = ID;
        this.operations = operations;
    }

    public abstract double processDuration();
    public abstract void processResources();

    // Method to calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (double cost : operationCosts) {
            total += cost;
        }
        return total;
    }

    // Method to calculate total amount of resources used
    public int calculateTotalResources() {
        int total = 0;
        for (int amount : resourceAmounts) {
            total += amount;
        }
        return total;
    }

    public void showDetails() {
        System.out.println("Process ID: " + ID);
        System.out.print("Operations: ");
        for (String op : operations) {
            System.out.print(op + " ");
        }
        System.out.println();
    }
}
