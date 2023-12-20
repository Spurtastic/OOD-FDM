package com.fdmgroup.mockitoDemo;

public class UserManager {
	
	private UserDatabaseAccess userDatabaseAccess;
	
	public UserManager(UserDatabaseAccess uDB) {
		this.userDatabaseAccess = uDB;
	}
	
	public boolean authenticate(String user, String pass) {
		User user1 = this.userDatabaseAccess.getUser(user);
		
		if (user1 != null && pass.equals(user1.getPassword())){
			return true;
		}
		
		return false;
	}
}
