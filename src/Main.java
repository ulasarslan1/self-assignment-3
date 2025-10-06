package self_assignment_3;
import java.time.Duration;

import Process.IndustrialProcess;
import Process.ManagementProcess;
import Resources.*;
import Resources.Position;
import Process.operation.*;

public class Main {
	public static void main(String[] args) {

		// Resources -> Ulas & Ashwin
		Resources human = new HumanResources("HR-1", "Operator", 100.0, 2.5);
		Resources nonHuman = new NonHumanResources("NH-1", "Robotic Arm", 5000, 2);
		Resources software = new SoftwareResources("SW-1", "ERP software", 9000, 15);
		Resources hardware = new HardwareResources("HW-1", "AGVs", 10000, 20);
		Resources material = new MaterialResources("M-1", "Steel", 5000, 1);

		System.out.println(human.getData());
		System.out.println(nonHuman.getData());
		System.out.println(software.getData());
		System.out.println(hardware.getData());
		System.out.println(material.getData());
		System.out.println();

		int totalAmount = human.getAmount() + nonHuman.getAmount() + software.getAmount() + hardware.getAmount() + material.getAmount();
		double totalCost = human.calculateCost() + nonHuman.calculateCost() + software.calculateCost() + hardware.calculateCost() + material.calculateCost();

		System.out.println("--- Cost of Resources ---");

		System.out.println("Total Coast = " + totalCost);
		System.out.println("Total Amount = " + totalAmount);

		System.out.println();
		
		System.out.println("--- AGV's ---\n");
		
		Resources agv1 = new AGV("AGV-1","Carry AGV",100.0, 70.0, Duration.ofHours(3).toMinutes(), new Position(0,0), 250, 230);
		Resources agv2 = new AGV("AGV-2","Garbage AGV", 100.0, 80.0, Duration.ofHours(1).toMinutes(),new Position(60,20), 170, 110);
		Resources agv3 = new AGV("AGV-3","Goods AGV" , 100.0, 20.0, Duration.ofHours(5).toMinutes(),new Position(10,30), 230, 190);
		Resources agv4 = new AGV("AGV-4", "Spare AGV" , 100.0, 40.0, Duration.ofHours(2).toMinutes(),new Position(3,9), 160, 145);
		
		System.out.println(agv1.getData());
		System.out.println("");
		System.out.println(agv2.getData());
		System.out.println("");
		System.out.println(agv3.getData());
		System.out.println("");
		System.out.println(agv4.getData());
		System.out.println("");

		// Processes -> Mrunal
		// Industrial Process
		String[] industrialOps = { "Welding", "Painting", "Packaging" };
		double[] industrialCosts = { 100, 150, 120 };
		int[] industrialResources = { 2, 3, 1 };

		IndustrialProcess ip = new IndustrialProcess("IP-001", industrialOps, industrialCosts, industrialResources);

		System.out.println("--- Industrial Process ---");
		ip.showDetails();
		System.out.println("Total Duration: " + ip.processDuration() + " hours");
		ip.processResources();

		System.out.println();

		// Management Process
		String[] managementOps = { "Scheduling", "QualityCheck" };
		double[] managementCosts = { 80, 60 };
		int[] managementResources = { 1, 1 };

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







