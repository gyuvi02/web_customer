package org.gyula.service;

import java.util.List;

import org.gyula.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
