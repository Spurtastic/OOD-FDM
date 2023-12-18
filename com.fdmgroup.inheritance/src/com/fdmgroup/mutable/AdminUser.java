package com.fdmgroup.mutable;

public class AdminUser extends UserAccount {

	public AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public void accessWebsite(){
        System.out.println("Accessing website as admin");
    }

    @Override
    public boolean changePassword(String newPAss, String confirmPass) {
        if (newPAss.equals(confirmPass)) {
            super.setPassword(newPAss);
            System.out.printf("Password changed");
            return true;
        }
        System.out.printf("Passwords do not match");
        return false;
    }
	
	

}
