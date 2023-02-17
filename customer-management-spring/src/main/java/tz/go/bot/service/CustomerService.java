package tz.go.bot.service;

import java.util.List;

import tz.go.bot.model.Customer;

public interface CustomerService {

	void addCustomer(Customer c);

	List<Customer> getAllCustomers();

	Customer getCustomerById(int id);

	void deleteCustomer(int id);

}