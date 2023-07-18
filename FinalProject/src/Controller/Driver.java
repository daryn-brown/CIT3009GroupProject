package Controller;

import java.util.Scanner;

import Models.Customer;
import Models.User;
//import Models.User;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createUser();
	}

	 public static void createUser() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the customer details:");
	        System.out.print("userID(Must be between 1 - 999): ");  
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character
	        System.out.print("First Name: ");
	        String firstName = scanner.nextLine();
	        System.out.print("Last Name: ");
	        String lastName = scanner.nextLine();
	        System.out.print("Email: ");
	        String email = scanner.nextLine();
	        System.out.print("Contact Number[(000)-000-0000]: ");
	        String contactNum = scanner.nextLine();
	        System.out.print("Password[(a-z,A-Z,0-9)]: ");
	        String password = scanner.nextLine();
	        System.out.print("customerID(Must be 5000+): ");
	        int customerID = scanner.nextInt();
	       User user = new User(id, firstName, lastName, email, contactNum, password);
	      
//	       Customer customer = new Customer( customerID, id, firstName, lastName, email, contactNum, password);
	       Customer customer = new Customer( customerID, id, firstName, lastName, email, contactNum, password,null,null);
	       try {
	    	   
	        	customer.create();
	        }catch(Exception ex) {
	        	ex.getStackTrace();
	        }
	        
	        

	        
	        //return student;
	    }
}
