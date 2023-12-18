package com.fdmgroup.mutable;

public class runner {
	
	public static void main(String[] args) {
		
		AdminUser admin = new AdminUser("admin", "admin", "admin");
		Customer customer = new Customer("customer", "customer", "customer");
		admin.accessWebsite();
		customer.accessWebsite();

		admin.changePassword("random","myNewPassword");
		customer.changePassword("test","test");

		UserAccountManager manager = new UserAccountManager();
		// create a bunch of random CUSTOMERS
		Customer c1 = new Customer("c1", "1234", "c1User");
		Customer c2 = new Customer("c2", "1234", "c2User");
		Customer c3 = new Customer("c3", "1234", "c3User");
		Customer c4 = new Customer("c4", "1234", "c4User");

		manager.addUser(c1);
		manager.addUser(c2);
		manager.addUser(c3);
		manager.addUser(c4);

		manager.login("c1", "1234");
		
	}

}
