package com.gana.backend.repositoryimplementation;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gana.backend.model.Customer;
import com.gana.backend.repository.CustomerRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepoImpl implements CustomerRepo {

	EntityManager entityManager;

	public CustomerRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public String save(Customer customer) {
		if (customer != null) {
			entityManager.merge(customer);
			return "Success";
		} else {
			return "Failed to add";
		}
	}

	@Override
	public Customer findById(int customerid) {
		return entityManager.find(Customer.class, customerid);
	}

	@Override
	public List<Customer> findAll() {
		return entityManager.createQuery("from Customer", Customer.class).getResultList();
	}

	@Override
	public String update(Customer customer) {
		if (customer != null) {
			entityManager.merge(customer);
			return "Success";
		} else {
			return "Failed to update";
		}

	}

	@Override
	public String deleteById(int customerid) {
		Customer customer = entityManager.find(Customer.class, customerid);
		if (customer != null) {
			entityManager.remove(customer);
			return "Success";
		} else {
			return "Failed to delete";
		}
	}

}
