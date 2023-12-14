package com.fdm.classesObjects;

import java.util.ArrayList;

public class ComputerStore {
	
	private String name;
	private ArrayList<Computer> compList =  new ArrayList<Computer>();
	
	
	public ComputerStore(String nameStore) {
		this.name = nameStore;
	}
	
	
	
	public void addComputer(Computer computer) {
		compList.add(computer);
	}
	
	public ArrayList<Computer> getAllComputers(){
		
		return this.compList;
	
	}
	
	public String toString() {
		String returnAllCompNames = "";
		for (Computer computer : this.compList) {
			System.out.println("yo");
			returnAllCompNames+=computer.getMODEL();
			returnAllCompNames+="\n";
		}
		String enderString = "All of the above are in %s";
		return returnAllCompNames + String.format(enderString, this.name);
	}

}
