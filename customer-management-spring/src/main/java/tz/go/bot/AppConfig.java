package tz.go.bot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tz.go.bot.repository.CustomerRepository;
import tz.go.bot.repository.CustomerRepositoryListImpl;
import tz.go.bot.service.CustomerService;
import tz.go.bot.service.CustomerServiceListImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		CustomerRepository customerRepository=new CustomerRepositoryListImpl();
		return customerRepository;
	}
	
	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		//Setter Injection
//		CustomerServiceListImpl customerService=new CustomerServiceListImpl();
//		
//		CustomerRepository customerRepository=getCustomerRepository();
//		customerService.setCustomerRepository(customerRepository);
		
		//Constructor Injection 
		CustomerRepository customerRepository=getCustomerRepository();
		CustomerServiceListImpl customerService=new CustomerServiceListImpl(customerRepository);
		
		return customerService;
		
	}
	
}
