package com.fdm.classesObjects;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.module.ModuleDescriptor.Modifier.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;


class HardDriveTest {

	@Test
	public void testReadData() {
		Field field = null;
		
		try {
			field = HardDrive.class.getDeclaredField("MODEL");
			field = HardDrive.class.getDeclaredField("CAPACITY");

		} catch (NoSuchFieldException | SecurityException e) {
			System.out.println("NOT SET TO FINAL");
			e.printStackTrace();
		}
		int modifiers = field.getModifiers();
		

		assertTrue(Modifier.isFinal(modifiers));
			
		
		
		
	}
	
	@Test
	public void testOutPut() {
		HardDrive d1 = new HardDrive("Seagate", 1.0);
		assertTrue(d1.readData("Random").equals("Random is being read"));
		
	}
	
	

}
