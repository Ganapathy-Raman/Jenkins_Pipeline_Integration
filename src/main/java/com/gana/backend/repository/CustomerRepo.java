package com.gana.backend.repository;

import java.util.List;

import com.gana.backend.model.Customer;

public interface CustomerRepo {

	public String save(Customer customer);

	public Customer findById(int customerid);

	public List<Customer> findAll();

	public String update(Customer customer);

	public String deleteById(int id);

}
