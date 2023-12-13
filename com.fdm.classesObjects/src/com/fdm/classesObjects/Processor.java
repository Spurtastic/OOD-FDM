package com.fdm.classesObjects;

public class Processor {
	
	private final String MODEL;
	private final int NUMBER_OF_CORES;
	private final double SPEED;
	public Processor(String Model, double speed, int numberOfCores) {
		MODEL = Model;
		NUMBER_OF_CORES = numberOfCores;
		SPEED = speed;
	}
	
	public String processData(String data){
		String retvalString = "%s is being processed";
		return String.format(retvalString, data);
		
	}
	
	public final String getMODEL() {
		return MODEL;
	}
	public final int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}
	public final double getSPEED() {
		return SPEED;
	}

	
	
	

}
