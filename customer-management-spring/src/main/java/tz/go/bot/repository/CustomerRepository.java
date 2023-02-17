package tz.go.bot.repository;

import java.util.List;

import tz.go.bot.model.Customer;

public interface CustomerRepository {

	void addCustomer(Customer c);

	List<Customer> getAllCustomers();

	Customer getCustomerById(int id);

	void deleteCustomer(int id);

}