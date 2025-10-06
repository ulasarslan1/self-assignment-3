import Processes.IndustrialProcess;
import Processes.ManagementProcess;
import Resources.HumanResources;
import Resources.NonHumanResources;
import Resources.Resources;

public class Main {
    public static void main(String[] args) {

		//Resources -> Ulas & Ashwin
    	Resources human = new HumanResources("HR-1", "Operator", 100.0, 2.5);
    	Resources nonHuman = new NonHumanResources("NH-1", "Robotic Arm", 5000, 2);
    	
    	System.out.println(human.getData());
    	System.out.println(nonHuman.getData());
    	System.out.println();
    	
    	int totalAmount = human.getAmount() + nonHuman.getAmount();
    	double totalCost = human.calculateCost() + nonHuman.calculateCost();

		System.out.println("--- Cost of Resources ---");

    	System.out.println("Total Coast = " + totalCost);
    	System.out.println("Total Amount = " + totalAmount);

		System.out.println();

		// Processes -> Mrunal
		// Industrial Process
		String[] industrialOps = {"Welding", "Painting", "Packaging"};
		double[] industrialCosts = {100, 150, 120};
		int[] industrialResources = {2, 3, 1};

		IndustrialProcess ip = new IndustrialProcess("IP-001", industrialOps, industrialCosts, industrialResources);

		System.out.println("--- Industrial Process ---");
		ip.showDetails();
		System.out.println("Total Duration: " + ip.processDuration() + " hours");
		ip.processResources();

		System.out.println();

		// Management Process
		String[] managementOps = {"Scheduling", "QualityCheck"};
		double[] managementCosts = {80, 60};
		int[] managementResources = {1, 1};

		ManagementProcess mp = new ManagementProcess("MP-001", managementOps, managementCosts, managementResources);

		System.out.println("--- Management Process ---");
		mp.showDetails();
		System.out.println("Total Duration: " + mp.processDuration() + " hours");
		mp.processResources();

		// ioperation -Adithya
		System.out.println();
        System.out.println("--- Operations ---");

        // Human Operation
        HumanOperation ho = new HumanOperation("HOP-001", "Assembly", 5.0, 3, 150.0);
        ho.showOperationInfo();
        ho.performOperation();
        System.out.println("Cost: " + ho.calculateCost() + " INR");

        System.out.println();

       // Transport Operation
      TransportOperation to = new TransportOperation("TOP-001", "Material Transport", 4.0, 2, 200.0, 50.0);
      to.showOperationInfo();
      to.performOperation();
      System.out.println("Cost: " + to.calculateCost() + " INR");
	}


    }







