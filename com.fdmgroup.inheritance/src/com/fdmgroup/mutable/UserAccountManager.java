package com.fdmgroup.mutable;

import java.util.ArrayList;

public class UserAccountManager {
	private ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();
	
	public void addUser(UserAccount userAccount) {
		userAccounts.add(userAccount);
	}
	public boolean login(String username, String password) {
		for (UserAccount userAccount : userAccounts) {
			if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)) {
				System.out.printf("Welcome %s", userAccount.getFullName());
				return true;
			}
		}
		System.out.printf("Are you sure %s is your username", username);
		return false;
	}
}
