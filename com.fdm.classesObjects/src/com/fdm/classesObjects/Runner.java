package com.fdm.classesObjects;

public class Runner {

	public static void main(String[] args) {
		// drive 1
		HardDrive seagate = new HardDrive("Seagate", 2048 );
		
		// drive 2
		HardDrive dell = new HardDrive("Dell",3072);
		
		// Processor 1
		Processor xeon = new Processor("Intel Xeon", 2.93, 6);
		
		// Processor 2
		Processor celeronProcessor = new Processor("Intel Celeron", 2.9, 2);
		
		// Memory 1
		Memory king = new Memory("Kingston", 4.00, 1600.00);
		
		// Memory 2
		Memory corsairMemory = new Memory("Corsair", 8.00, 1333.00);
		

	}

}
