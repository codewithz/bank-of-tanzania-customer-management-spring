package tz.go.bot.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import tz.go.bot.model.Customer;
import tz.go.bot.service.CustomerService;
import tz.go.bot.service.CustomerServiceListImpl;

public class CustomerUI {
	
	CustomerService customerService=new CustomerServiceListImpl();
	public void intiateApp() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-------- Welcome to the Bank of Tanzania - Console Banking -----------");
		
		
		while(true) {
			System.out.println("Please enter your choice");
			System.out.println("1 for Adding a New Customer");
			System.out.println("2 for Displaying All The Customers");
			System.out.println("3 for Searching a Customer");
			System.out.println("4 for Deleting a Customer");
			System.out.println("5 for Exiting the Application");
			
			int option=sc.nextInt();
			
			switch (option) {
			case 1:
				System.out.print("Enter Id:");
				int id=sc.nextInt();
				System.out.print("Enter Name:");
				String name=sc.next();
				System.out.print("Enter Contact:");
				long contact=sc.nextLong();
				System.out.print("Enter Account Type (Current | Savings):");
				String accountType=sc.next();
				
				Customer customer=new Customer(id, name, contact, accountType, LocalDate.now());
				
				customerService.addCustomer(customer);
				System.out.println("Customer Added Successfully");
				break;
			case 2:
				List<Customer> customers=customerService.getAllCustomers();
				for(Customer c:customers) {
					System.out.println(c);
				
				}
				break;
			case 3:
				System.out.print("Enter an id to search");
				int idToSearch=sc.nextInt();
				Customer customerReturned=customerService.getCustomerById(idToSearch);
				if(customerReturned!=null) {
					System.out.println(customerReturned);
				}
				else {
					System.out.println("No customer for given Id");
				}
				break;
			case 4:
				System.out.println("Deleting  a Customer");
				break;
			case 5:
				System.out.println("Thanks for using our service!!");
				System.exit(0);
				break;
			default:
				System.out.println("Incorrect option selected");
				break;
			}
			
			System.out.println("____________________________________________________________________");
			
		}
		
	}

}
