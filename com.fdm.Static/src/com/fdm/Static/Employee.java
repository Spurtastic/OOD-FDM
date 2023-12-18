package com.fdm.Static;

public class Employee {
    private String name;
    private String jobTitle;
    private double hourlyRate;
    private static double minimumWage = 10000;
    
    
    
	public String getName() {
		return name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public static double getMinimumWage() {
		return minimumWage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public void setHourlyRate(double hourlyRate) {

        if (hourlyRate < minimumWage) {
            this.hourlyRate = minimumWage;
            System.out.println("Hourly rate set to minimum wage below the threshold");
        }
		this.hourlyRate = hourlyRate;
	}
	public static void setMinimumWage(double minimumWage) {
		Employee.minimumWage = minimumWage;
	}
    

}
