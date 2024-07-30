package com.gana.backend.service;

import java.util.List;

import com.gana.backend.model.Customer;

public interface CustomerService {

	public String addCustomer(Customer customer);

	public Customer getCustomer(int customerid);

	public List<Customer> getAllCustomers();

	public String updateCustomer(Customer customer);

	public String deleteCustomer(int customerid);

}
