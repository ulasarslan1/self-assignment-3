import Processes.IndustrialProcess;
import Processes.ManagementProcess;
import Resources.HumanResources;
import Resources.NonHumanResources;
import Resources.Resources;

public class Main {
    public static void main(String[] args) {


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


		// Industrial Process
		String[] industrialOps = {"Welding", "Painting", "Packaging"};
		IndustrialProcess ip = new IndustrialProcess("IP-001", industrialOps);

		System.out.println("--- Industrial Process ---");
		ip.showDetails();
		System.out.println("Total Duration: " + ip.processDuration() + " hours");
		ip.processResources();

		System.out.println();

		// Management Process
		String[] managementOps = {"Scheduling", "QualityCheck"};
		ManagementProcess mp = new ManagementProcess("MP-001", managementOps);

		System.out.println("--- Management Process ---");
		mp.showDetails();
		System.out.println("Total Duration: " + mp.processDuration() + " hours");
		mp.processResources();
	}


    }







