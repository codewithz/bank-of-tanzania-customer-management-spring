package tz.go.bot.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import tz.go.bot.model.Customer;

public class CustomerRepositoryDBImpl implements CustomerRepository {
	
	List<Customer> customers=new ArrayList<Customer>();
	
	Customer c1=new Customer(1000,"Tom",99887722,"Savings",LocalDate.now());
	Customer c2=new Customer(1001,"Alex",99886655,"Current",LocalDate.now());
	Customer c3=new Customer(1002,"Mike",99887733,"Savings",LocalDate.now());
	Customer c4=new Customer(1003,"John",99887711,"Current",LocalDate.now());
	
	//default block
	{
		customers.add(c1);
		customers.add(c2);//Loose Coupling
		customers.add(c3);
		customers.add(c4);
	}
	
	public void addCustomer(Customer c) {
		customers.add(c);
	}
	
	public List<Customer> getAllCustomers(){
		return customers;
	}
	
	public Customer getCustomerById(int id) {
		Customer c=null;
		
		for(Customer customerFromList:getAllCustomers()) {
			if(customerFromList.getId()==id) {
				c=customerFromList;
				break;
			}
		}
		
		return c;
	}
	
	public void deleteCustomer(int id) {
		
	}
	
	

}
