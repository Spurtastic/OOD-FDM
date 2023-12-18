package com.fdm.Static;

public class EnergyMatterCalculator {
	
	
	public static double SPEED_OF_LIGHT = 299792458.0;
	
	
	public double matterToEnergy(double matter) {
		return matter * (Math.pow(SPEED_OF_LIGHT, 2));
	}
	
	


	public double energyToMatter(double energy) {
		return energy/(Math.pow(SPEED_OF_LIGHT, 2));
	}
	

}
