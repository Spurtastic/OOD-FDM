package com.fdmgroup.mutable;

public abstract class UserAccount {
    private String username;
    private String password;
    private String fullName;


    
    public UserAccount(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }


    public boolean changePassword(String newPAss, String confirmPass) {
        if (newPAss.equals(confirmPass)) {
            this.password = newPAss;
            System.out.printf("Password changed");
            return true;
        }
        System.out.printf("Passwords do not match");
        return false;
    }
    
    abstract void accessWebsite();


	public String getUsername() {
		return username;
	}


	public String getFullName() {
		return fullName;
	}

    public String getPassword() {
        return password;
    }


	public void setUsername(String username) {
		this.username = username;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
    
    
    
}
