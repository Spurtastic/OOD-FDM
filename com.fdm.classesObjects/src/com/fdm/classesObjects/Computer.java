package com.fdm.classesObjects;

public class Computer {
	
	
	private final String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private final Processor PROCESSOR;
	
	
	
	
	
	
	
	public Computer(String mODEL, HardDrive hardDrive, Memory memory, Processor pROCESSOR) {
		MODEL = mODEL;
		this.hardDrive = hardDrive;
		this.memory = memory;
		PROCESSOR = pROCESSOR;
	}
	
	
	public void turnOn() {
		System.out.println("Computer is turning on");
	}
	public void turnOff() {
		System.out.println("Computer is turning off");
	}
	
	public void getPower(PowerSource pwrSource) {
		System.out.printf("%s is getting power rated at %s watts", this.MODEL ,pwrSource.supplyPower());
	}
	
	public final String getMODEL() {
		return MODEL;
	}
	public final HardDrive getHardDrive() {
		return hardDrive;
	}
	public final Memory getMemory() {
		return memory;
	}
	public final Processor getPROCESSOR() {
		return PROCESSOR;
	}
	
	public final void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}
	public final void setMemory(Memory memory) {
		this.memory = memory;
	}
	
	
	

}
