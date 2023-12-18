package com.fdm.classesObjects;

public class HardDrive {


	private String MODEL;
	
	private final double CAPACITY ;
	
	private double usedSpace;
	
	public HardDrive(String mODEL, double cAPACITY) {
		super();
		
		this.MODEL = mODEL;
		
		this.CAPACITY = cAPACITY;
		
	}
	
	public String readData(String file) {
		String retVal = "%s is being read";
		return String.format(retVal, file);
	}
	
	public void writeData(String data, String file) {
		System.out.println(readData(file));
		System.out.printf("%s writing to %s", data, file);
	}

	public String getMODEL() {
		return MODEL;
	}

	public double getCAPACITY() {
		return CAPACITY;
	}
	
	public double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
		System.out.printf("%s GB used", this.usedSpace);
	}
	

	
	
	
	
	
}
