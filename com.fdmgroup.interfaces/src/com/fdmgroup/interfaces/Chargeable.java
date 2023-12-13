package com.fdmgroup.interfaces;

public interface Chargeable {
	
	
	
	void charge(double amps);
	void
	default void connectToUsb() {
		System.out.println("Connected to USB");
		
	}
	
	static double calculateWatt(double amps, double volts){
		return amps * volts
	}

}
