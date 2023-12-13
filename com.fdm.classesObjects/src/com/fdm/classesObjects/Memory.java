package com.fdm.classesObjects;

public class Memory {
	
	private final String MODEL;
	private final double CAPACITY;
	private final double SPEED;
	
	public Memory(String mODEL, double cAPACITY, double sPEED) {
		MODEL = mODEL;
		CAPACITY = cAPACITY;
		SPEED = sPEED;
	}
	
	
	public void storeData(String data) {
		System.out.printf("%s is being written", data);
		
	}

	public final String getMODEL() {
		return MODEL;
	}

	public final double getCAPACITY() {
		return CAPACITY;
	}

	public final double getSPEED() {
		return SPEED;
	}

	
	
}
