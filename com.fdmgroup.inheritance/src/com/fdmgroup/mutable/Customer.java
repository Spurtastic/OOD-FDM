package com.fdmgroup.mutable;

public class Customer extends UserAccount {
    
        public Customer(String username, String password, String fullName) {
            super(username, password, fullName);
            // TODO Auto-generated constructor stub
        }
        
        @Override
        public void accessWebsite(){
            System.out.println("Accessing website as customer");
        }

}
