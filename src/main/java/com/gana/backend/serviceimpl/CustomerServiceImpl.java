package com.gana.backend.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gana.backend.model.Customer;
import com.gana.backend.repository.CustomerRepo;
import com.gana.backend.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	CustomerRepo repo;

	public CustomerServiceImpl(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addCustomer(Customer customer) {

		return repo.save(customer);

	}

	@Override
	public Customer getCustomer(int customerid) {

		return repo.findById(customerid);

	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();

	}

	@Override
	public String updateCustomer(Customer customer) {
		return repo.update(customer);

	}

	@Override
	public String deleteCustomer(int customerid) {
		return repo.deleteById(customerid);
	}

}
