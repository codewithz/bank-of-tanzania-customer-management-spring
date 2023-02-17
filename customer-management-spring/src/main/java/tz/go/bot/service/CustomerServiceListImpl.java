package tz.go.bot.service;

import java.util.List;

import tz.go.bot.model.Customer;
import tz.go.bot.repository.CustomerRepository;
import tz.go.bot.repository.CustomerRepositoryDBImpl;
import tz.go.bot.repository.CustomerRepositoryListImpl;

public class CustomerServiceListImpl implements CustomerService {
	
//	Tight Coupled
//	CustomerRepository customerRepository=new CustomerRepositoryListImpl();
	
	CustomerRepository customerRepository;
	
	//Setter Injection [Loose Coupling]
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	public CustomerServiceListImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Constructor Injection
	public CustomerServiceListImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public void addCustomer(Customer c) {
		
		//Validation 
		if(c.getAccountType().equalsIgnoreCase("Savings")||c.getAccountType().equalsIgnoreCase("Current")) {
			
			customerRepository.addCustomer(c);
		}
		else {
			System.out.println("Wrong Account Type Added");
		}
		
	}
	
	public List<Customer> getAllCustomers(){
		return customerRepository.getAllCustomers();
	}
	
	public Customer getCustomerById(int id) {
		return customerRepository.getCustomerById(id);
	}
	
	public void deleteCustomer(int id) {
		
	}

}
