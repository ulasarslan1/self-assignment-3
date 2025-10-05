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

    public void showDetails() {
        System.out.println("Process ID: " + ID);
        System.out.print("Operations: ");
        for (String op : operations) {
            System.out.print(op + " ");
        }
        System.out.println();
    }
}
